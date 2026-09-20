package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i6x implements s5f0 {

    /* JADX INFO: renamed from: g */
    public static final r300 f99373g;

    /* JADX INFO: renamed from: h */
    public static final r300 f99374h;

    /* JADX INFO: renamed from: a */
    public final String f99375a;

    /* JADX INFO: renamed from: b */
    public final String f99376b;

    /* JADX INFO: renamed from: c */
    public final long f99377c;

    /* JADX INFO: renamed from: d */
    public final long f99378d;

    /* JADX INFO: renamed from: e */
    public final byte[] f99379e;

    /* JADX INFO: renamed from: f */
    public int f99380f;

    static {
        p300 p300Var = new p300();
        p300Var.f173527o = def0.m35799p("application/id3");
        f99373g = new r300(p300Var);
        p300 p300Var2 = new p300();
        p300Var2.f173527o = def0.m35799p("application/x-scte35");
        f99374h = new r300(p300Var2);
    }

    public i6x(String str, String str2, long j, long j2, byte[] bArr) {
        this.f99375a = str;
        this.f99376b = str2;
        this.f99377c = j;
        this.f99378d = j2;
        this.f99379e = bArr;
    }

    @Override // p204p.s5f0
    /* JADX INFO: renamed from: a */
    public final r300 mo49821a() {
        String str = this.f99375a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f99374h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f99373g;
            default:
                return null;
        }
    }

    @Override // p204p.s5f0
    /* JADX INFO: renamed from: c */
    public final byte[] mo49822c() {
        if (mo49821a() != null) {
            return this.f99379e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i6x.class == obj.getClass()) {
            i6x i6xVar = (i6x) obj;
            if (this.f99377c == i6xVar.f99377c && this.f99378d == i6xVar.f99378d && Objects.equals(this.f99375a, i6xVar.f99375a) && Objects.equals(this.f99376b, i6xVar.f99376b) && Arrays.equals(this.f99379e, i6xVar.f99379e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f99380f == 0) {
            String str = this.f99375a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f99376b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f99377c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f99378d;
            this.f99380f = Arrays.hashCode(this.f99379e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f99380f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f99375a + ", id=" + this.f99378d + ", durationMs=" + this.f99377c + ", value=" + this.f99376b;
    }
}
