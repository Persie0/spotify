package p204p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w2s0 {

    /* JADX INFO: renamed from: a */
    public final int f247416a;

    /* JADX INFO: renamed from: b */
    public final int f247417b;

    /* JADX INFO: renamed from: c */
    public final long f247418c;

    /* JADX INFO: renamed from: d */
    public final long f247419d;

    public w2s0(int i, int i2, long j, long j2) {
        this.f247416a = i;
        this.f247417b = i2;
        this.f247418c = j;
        this.f247419d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static w2s0 m87084a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            w2s0 w2s0Var = new w2s0(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return w2s0Var;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m87085b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f247416a);
            dataOutputStream.writeInt(this.f247417b);
            dataOutputStream.writeLong(this.f247418c);
            dataOutputStream.writeLong(this.f247419d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof w2s0)) {
            w2s0 w2s0Var = (w2s0) obj;
            if (this.f247417b == w2s0Var.f247417b && this.f247418c == w2s0Var.f247418c && this.f247416a == w2s0Var.f247416a && this.f247419d == w2s0Var.f247419d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f247417b), Long.valueOf(this.f247418c), Integer.valueOf(this.f247416a), Long.valueOf(this.f247419d));
    }
}
