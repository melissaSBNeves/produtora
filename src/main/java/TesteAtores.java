public class TesteAtores {

    public static void main(String[] args) {

        Produtora consultoria = new Produtora("Consultoria", 100);
        Ator ator01 = new Ator("Mel", 90, 90.0);
        Protagonista ator02 = new Protagonista("Melissa", 90, 90.0, 90, 200.0);

        System.out.println(ator01);
        System.out.println("Salário:  " + ator01.getSalario());

        System.out.println("*------------------------*");

        System.out.println(ator02);
        System.out.println("*------------------------*");
        String msgExistePorNome = consultoria.existePorNome("Melissa") ? "Esse ator existe" : "Esse ator não existe";
        System.out.println(msgExistePorNome);

        consultoria.contratar(ator01);
        consultoria.contratar(ator02);

        System.out.println("*------------------------*");
        System.out.println(consultoria.getAtores());

        System.out.println("*------------------------*");
        System.out.println("Quantidade de atores: " + consultoria.getQuantidadeAtores());

        System.out.println("*------------------------*");
        System.out.println("Quantidade de protagonistas: " + consultoria.getQunatidadeProtagonistas());

        System.out.println("*------------------------*");
        System.out.println("Total salários: " + consultoria.getTotalSalarios());
        System.out.println(consultoria.buscarAtorPorNome("Mel"));
    }
}
