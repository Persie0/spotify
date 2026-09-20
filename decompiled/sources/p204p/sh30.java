package p204p;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes15.dex */
public final class sh30 implements vg30 {

    /* JADX INFO: renamed from: a */
    public final String f209080a;

    /* JADX INFO: renamed from: b */
    public byte[] f209081b;

    public sh30(String str) {
        this.f209080a = str;
    }

    @Override // p204p.vg30
    /* JADX INFO: renamed from: a */
    public final String mo43248a() {
        return "application/json";
    }

    @Override // p204p.vg30
    public final byte[] getEncoded() {
        byte[] bArr = this.f209081b;
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f209080a.getBytes(Charset.forName("UTF-8"));
        this.f209081b = bytes;
        return bytes;
    }
}
