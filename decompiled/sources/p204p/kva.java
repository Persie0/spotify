package p204p;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class kva {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126804a;

    /* JADX INFO: renamed from: b */
    public final String f126805b;

    /* JADX INFO: renamed from: c */
    public final String f126806c;

    /* JADX INFO: renamed from: d */
    public final Serializable f126807d;

    public /* synthetic */ kva(String str, String str2, Serializable serializable, int i) {
        this.f126804a = i;
        this.f126805b = str;
        this.f126806c = str2;
        this.f126807d = serializable;
    }

    /* JADX INFO: renamed from: a */
    public final InputStream m57454a() {
        switch (this.f126804a) {
            case 0:
                byte[] bArr = (byte[]) this.f126807d;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return new ByteArrayInputStream(bArr);
            default:
                File file = (File) this.f126807d;
                if (!file.exists() || !file.isFile()) {
                    return null;
                }
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException unused) {
                    return null;
                }
        }
    }
}
