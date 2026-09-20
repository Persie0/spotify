package p204p;

import androidx.car.app.model.Alert;
import java.io.InputStream;
import java.io.OutputStream;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class mpa extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ npa f145949a;

    public mpa(npa npaVar) {
        this.f145949a = npaVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f145949a.f156904b, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // java.io.InputStream
    public final int read() {
        npa npaVar = this.f145949a;
        if (npaVar.f156904b > 0) {
            return npaVar.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        return this.f145949a + ".inputStream()";
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.f145949a.read(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
