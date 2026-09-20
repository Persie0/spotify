package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class p591 {

    /* JADX INFO: renamed from: a */
    public final int f174122a;

    /* JADX INFO: renamed from: b */
    public final String f174123b;

    /* JADX INFO: renamed from: c */
    public final String f174124c;

    /* JADX INFO: renamed from: d */
    public final int f174125d;

    public p591(int i, String str, int i2, String str2) {
        this.f174122a = i;
        this.f174123b = str;
        this.f174124c = str2;
        this.f174125d = i2;
    }

    /* JADX INFO: renamed from: a */
    public final w780 m69168a() {
        w780 w780Var = new w780((char) 0, 11);
        w780Var.f248598b = this.f174122a;
        w780Var.f248600d = this.f174123b;
        w780Var.f248601e = this.f174124c;
        w780Var.f248599c = this.f174125d;
        return w780Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p591)) {
            return false;
        }
        p591 p591Var = (p591) obj;
        return this.f174122a == p591Var.f174122a && Objects.equals(this.f174123b, p591Var.f174123b) && Objects.equals(this.f174124c, p591Var.f174124c) && this.f174125d == p591Var.f174125d;
    }

    public final int hashCode() {
        int i = this.f174122a * 31;
        String str = this.f174123b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f174124c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f174125d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationRequest{outputHeight=");
        sb.append(this.f174122a);
        sb.append(", audioMimeType='");
        sb.append(this.f174123b);
        sb.append("', videoMimeType='");
        sb.append(this.f174124c);
        sb.append("', hdrMode=");
        return edb.m38567p(sb, this.f174125d, '}');
    }
}
