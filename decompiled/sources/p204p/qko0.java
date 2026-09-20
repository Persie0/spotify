package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class qko0 {

    /* JADX INFO: renamed from: a */
    public final String f189626a;

    /* JADX INFO: renamed from: b */
    public final String f189627b;

    /* JADX INFO: renamed from: c */
    public final String f189628c;

    /* JADX INFO: renamed from: d */
    public final String f189629d;

    /* JADX INFO: renamed from: e */
    public final String f189630e;

    public qko0(String str, String str2, String str3, String str4, String str5) {
        this.f189626a = str;
        this.f189627b = str2;
        this.f189628c = str3;
        this.f189629d = str4;
        this.f189630e = str5;
    }

    /* JADX INFO: renamed from: a */
    public final String m73131a() {
        return this.f189629d;
    }

    /* JADX INFO: renamed from: b */
    public final String m73132b() {
        return this.f189628c;
    }

    /* JADX INFO: renamed from: c */
    public final String m73133c() {
        return this.f189626a;
    }

    /* JADX INFO: renamed from: d */
    public final String m73134d() {
        return this.f189630e;
    }

    /* JADX INFO: renamed from: e */
    public final String m73135e() {
        return this.f189627b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qko0)) {
            return false;
        }
        qko0 qko0Var = (qko0) obj;
        return wj50.m88271j(this.f189626a, qko0Var.f189626a) && wj50.m88271j(this.f189627b, qko0Var.f189627b) && wj50.m88271j(this.f189628c, qko0Var.f189628c) && wj50.m88271j(this.f189629d, qko0Var.f189629d) && wj50.m88271j(this.f189630e, qko0Var.f189630e);
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m73136f() {
        String str = this.f189626a;
        int length = str.length();
        String str2 = this.f189627b;
        int length2 = str2.length() + length;
        String str3 = this.f189628c;
        int length3 = str3.length() + length2;
        int i = length3 + 3;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length3 + 5);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) i);
        bc5.m28673a(str, byteBufferAllocate);
        bc5.m28673a(str2, byteBufferAllocate);
        bc5.m28673a(str3, byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f189626a.hashCode() * 31, 31, this.f189627b), 31, this.f189628c);
        String str = this.f189629d;
        return this.f189630e.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ qko0(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, "");
    }
}
