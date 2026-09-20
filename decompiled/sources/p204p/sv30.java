package p204p;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sv30 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f214308a = 0;

    static {
        char c = File.separatorChar;
        dl51 dl51Var = new dl51();
        PrintWriter printWriter = new PrintWriter(dl51Var);
        printWriter.println();
        dl51Var.toString();
        printWriter.close();
    }

    /* JADX INFO: renamed from: a */
    public static void m79425a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m79426b(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            m79425a(closeable);
        }
    }
}
