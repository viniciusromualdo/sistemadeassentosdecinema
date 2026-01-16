public class Assento {
    private EstadosDeAssento estado = EstadosDeAssento.LIVRE;
    private int id;

    public Assento(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void reservarAssento(){
        if (estado == EstadosDeAssento.LIVRE){
            estado = EstadosDeAssento.RESERVADO;
        } else if (estado == EstadosDeAssento.RESERVADO || estado == EstadosDeAssento.OCUPADO) {
            throw new IllegalStateException("Não é possível reservar o assento que está " + estado);
        }
    }

    public void ocuparAssento(){
        if(estado == EstadosDeAssento.RESERVADO){
            estado = EstadosDeAssento.OCUPADO;
        } else if (estado == EstadosDeAssento.OCUPADO || estado == EstadosDeAssento.LIVRE){
            throw new IllegalStateException("Não é possível ocupar o assento que está " + estado);
        }
    }
}
