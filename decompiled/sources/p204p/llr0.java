package p204p;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class llr0 {

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f134690b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final File f134691a;

    public llr0(File file) {
        this.f134691a = file;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m59309a() {
        File file = this.f134691a;
        byte[] bArr = new byte[(int) file.length()];
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                return bArr;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(dataInputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            utu0 utu0Var = gk71.f80747a;
            utu0Var.m83940H("RCS");
            utu0Var.m83955x(e, "Can't read from file <" + file + ">", new Object[0]);
            return bArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m59310b(byte[] bArr) {
        File file = this.f134691a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                utu0 utu0Var = gk71.f80747a;
                utu0Var.m83940H("RCS");
                utu0Var.m83952u("Writing <" + bArr.length + "> bytes to file <" + file + ">", new Object[0]);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            utu0 utu0Var2 = gk71.f80747a;
            utu0Var2.m83940H("RCS");
            utu0Var2.m83955x(e, "Can't write to file <" + file + ">", new Object[0]);
        }
    }
}
