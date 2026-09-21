public class Main {

    public static void main(String[] args) {

        // A single file, reached through the common abstraction.
        FileSystemComponent report = new DocumentFile("report.pdf", 500);

        // An empty folder returns zero.
        FileSystemComponent emptyFolder = new Folder("empty");

        // A tree with two levels of subfolders.
        Folder root = new Folder("root")
                .add(new DocumentFile("photo.png", 1_500))
                .add(new Folder("documents")
                        .add(new DocumentFile("contract.docx", 300))
                        .add(new Folder("invoices")
                                .add(new DocumentFile("invoice-01.pdf", 120))
                                .add(new DocumentFile("invoice-02.pdf", 180))))
                .add(emptyFolder);

        // Files and folders are queried exactly the same way.
        FileSystemComponent[] components = {report, emptyFolder, root};

        for (FileSystemComponent component : components) {
            System.out.println(component.getName() + ": " + component.getSize() + " KB");
        }

        System.out.println();

        // Additional challenge: the whole hierarchy printed from its root.
        root.display("");
    }
}
