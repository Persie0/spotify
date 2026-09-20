package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class wxs0 implements ays0 {

    /* JADX INFO: renamed from: a */
    public final String f256099a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f256100b;

    public wxs0(String str, ArrayList arrayList) {
        this.f256099a = str;
        this.f256100b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxs0)) {
            return false;
        }
        wxs0 wxs0Var = (wxs0) obj;
        return wj50.m88271j(this.f256099a, wxs0Var.f256099a) && this.f256100b.equals(wxs0Var.f256100b);
    }

    public final int hashCode() {
        String str = this.f256099a;
        return this.f256100b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
