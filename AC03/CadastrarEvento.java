public class CadastrarEvento {
  String nome;
  String data;
  String local;
  int numeroInscritos;
  int maxParticipante;
  String infoAdicionais;

  CadastrarEvento (String nome, String data, String local, int numeroInscritos, int maxParticipante, String infoAdicionais){
    this.nome = nome;
    this.data = data;
    this.local = local;
    this.numeroInscritos = 0;
    this.maxParticipante = maxParticipante;
    this.infoAdicionais = infoAdicionais;
  }
}
