package p204p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mj40 {

    /* JADX INFO: renamed from: a */
    public final int f144154a;

    /* JADX INFO: renamed from: b */
    public final int f144155b;

    /* JADX INFO: renamed from: c */
    public final List f144156c;

    public mj40(int i, int i2, CharSequence... charSequenceArr) {
        List listAsList = Arrays.asList(charSequenceArr);
        this.f144154a = i;
        this.f144155b = i2;
        this.f144156c = listAsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj40)) {
            return false;
        }
        mj40 mj40Var = (mj40) obj;
        return this.f144154a == mj40Var.f144154a && this.f144155b == mj40Var.f144155b && wj50.m88271j(this.f144156c, mj40Var.f144156c);
    }

    public final int hashCode() {
        return this.f144156c.hashCode() + mt60.m62800g(this.f144155b, Integer.hashCode(this.f144154a) * 31, 31);
    }
}
