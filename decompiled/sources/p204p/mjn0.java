package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class mjn0 {

    /* JADX INFO: renamed from: a */
    public final String f144295a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f144296b;

    public mjn0(String str, ArrayList arrayList) {
        this.f144295a = str;
        this.f144296b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjn0)) {
            return false;
        }
        mjn0 mjn0Var = (mjn0) obj;
        return this.f144295a.equals(mjn0Var.f144295a) && this.f144296b.equals(mjn0Var.f144296b);
    }

    public final int hashCode() {
        return this.f144296b.hashCode() + (this.f144295a.hashCode() * 31);
    }
}
