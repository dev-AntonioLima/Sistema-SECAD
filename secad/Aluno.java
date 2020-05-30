package secad;

import java.sql.*;
import java.util.ArrayList;


public class Aluno {

    private int matriculaaluno;
    private String nome;
    private int cpf;
    private int rg;
    private int nascimento;
    private int cep;
    private String endereco;
    private String cidade;
    private String complemento;
    private TipoSexo sexo;
    private TipoCivil estadocivil;
    private String curso;
    private  TipoTurno turno;
    private int telefone;
    private int celular;
    private String email;


  
    public int getMatriculaaluno() {
        return matriculaaluno;
    }

    public void setMatriculaaluno(int matriculaaluno) {
        this.matriculaaluno = matriculaaluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

  
    public int getRg() {
        return rg;
    }

  
    public void setRg(int rg) {
        this.rg = rg;
    }

  
    public int getNascimento() {
        return nascimento;
    }

  
    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

   
    public int getCep() {
        return cep;
    }

    
    public void setCep(int cep) {
        this.cep = cep;
    }

   
    public String getEndereco() {
        return endereco;
    }

   
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

 
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

  
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

  
    public TipoSexo getSexo() {
        return sexo;
    }

   
    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    
    public TipoCivil getEstadocivil() {
        return estadocivil;
    }

   
    public void setEstadocivil(TipoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

   
    public String getCurso() {
        return curso;
    }

    
    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    public TipoTurno  getTurno() {
        return turno;
    }

   
    public void setTurno (TipoTurno turno) {
        this.turno = turno;
    }
    
    public int getTelefone() {
        return telefone;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
      
    }
    
    public int getCelular() {
        return celular;
    }
    
    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
        
    
    
    public boolean inserir() {
        Conexao c = new Conexao();
        Boolean controle = false;
        String msg = "";
        try {
            String sql = "INSERT INTO aluno VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getMatriculaaluno());
            statement.setString(2, this.getNome());
            statement.setInt(3, this.getCpf());
            statement.setInt(4, this.getRg());
            statement.setInt(5,this.getNascimento());
            statement.setInt(6, this.getCep());
            statement.setString(7,this.getEndereco());
            statement.setString(8,this.getCidade());
            statement.setString(9, this.getComplemento());
            statement.setString(10,this.getSexo().toString());
            statement.setString(11,this.getEstadocivil().toString());
            statement.setString(12,this.getCurso());
            statement.setString(13,this.getTurno().toString());
            statement.setInt(14,this.getTelefone());
            statement.setInt(15,this.getCelular());
            statement.setString(16,this.getEmail());
            
            int rowsInserted = statement.executeUpdate();
            controle = rowsInserted > 0;
        } catch (SQLException ex) {
            msg = ex.getMessage();
        } finally {
            c.fechar();
        }
        return controle;
    }
    
    public boolean alterar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "UPDATE aluno SET  nome = ?, cpf = ?, rg = ?, nascimento = ?, cep = ?, endereco = ?, cidade = ?, complemento = ?, sexo = ?, estadocivil = ?, curso = ?, turno = ? WHERE matriculaaluno = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getMatriculaaluno());
            statement.setString(2, this.getNome());
            statement.setInt(3, this.getCpf());
            statement.setInt(4, this.getRg());
            statement.setInt(5,this.getNascimento());
            statement.setInt(6, this.getCep());
            statement.setString(7,this.getEndereco());
            statement.setString(8,this.getCidade());
            statement.setString(9, this.getComplemento());
            statement.setString(10,this.getSexo().toString());
            statement.setString(11,this.getEstadocivil().toString());
            statement.setString(12,this.getCurso());
            statement.setString(13,this.getTurno().toString());
            statement.setInt(14,this.getTelefone());
            statement.setInt(15,this.getCelular());
            statement.setString(16,this.getEmail());
          
            int rowsUpdate = statement.executeUpdate();
            controle = rowsUpdate > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
        return controle;
    }
    
    public boolean excluir() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "DELETE FROM aluno WHERE matriculaaluno = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getMatriculaaluno());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                controle = true;
            } else {
                controle = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
        return controle;
    }
    
    public void consultar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        try {
            String sql = "SELECT * FROM aluno WHERE id = ?";
            PreparedStatement statement = c.getConn().prepareStatement(sql);
            statement.setInt(1, this.getMatriculaaluno());
            ResultSet result = statement.executeQuery();
            if (result.next()) {
            this.setMatriculaaluno(result.getInt("matriculaaluno"));
            this.setNome(result.getString("nome"));
            this.setCpf(result.getInt("cpf"));
            this.setRg(result.getInt("rg"));
            this.setNascimento(result.getInt("nascimento"));
            this.setCep(result.getInt("cep"));
            this.setEndereco(result.getString("endereco"));
            this.setCidade(result.getString("cidade"));
            this.setComplemento(result.getString("complemento"));
            this.setSexo(TipoSexo.valueOf(result.getString("sexo")));
            this.setEstadocivil(TipoCivil.valueOf(result.getString("estadocivil")));
            this.setTurno(TipoTurno.valueOf(result.getString("turno")));
            this.setTelefone(result.getInt("telefone"));
            this.setCelular(result.getInt("celular"));
            this.setEmail(result.getString("email"));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
    }
    public ArrayList<Aluno> listar() {
        Conexao c = new Conexao();
        Boolean controle = false;
        ArrayList<Aluno> la = new ArrayList<Aluno>();
        try {
            String sql = "SELECT * FROM Aluno";
            PreparedStatement statement = c.getConn().prepareStatement(sql);

            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Aluno a = new Aluno();
                a.setMatriculaaluno(result.getInt("matriculaaluno"));
                a.setNome(result.getString("nome"));
                a.setCpf(result.getInt("cpf"));
                a.setRg(result.getInt("rg"));
                a.setNascimento(result.getInt("nascimento"));
                a.setCep(result.getInt("cep"));
                a.setEndereco(result.getString("endereco"));
                a.setCidade(result.getString("cidade"));
                a.setComplemento(result.getString("complemento"));
                a.setSexo(TipoSexo.valueOf(result.getString("sexo")));
                a.setEstadocivil(TipoCivil.valueOf(result.getString("estadocivil")));
                a.setTurno(TipoTurno.valueOf(result.getString("turno")));
          
            
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         finally {
            c.fechar();
        }
        return la;
    }
}
  

   



    
    
