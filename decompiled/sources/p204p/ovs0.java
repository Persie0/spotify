package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ovs0 {

    /* JADX INFO: renamed from: a */
    public final String f170557a;

    /* JADX INFO: renamed from: b */
    public final String f170558b;

    /* JADX INFO: renamed from: c */
    public final String f170559c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f170560d;

    public ovs0(String str, String str2, String str3, ArrayList arrayList) {
        this.f170557a = str;
        this.f170558b = str2;
        this.f170559c = str3;
        this.f170560d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovs0)) {
            return false;
        }
        ovs0 ovs0Var = (ovs0) obj;
        return wj50.m88271j(this.f170557a, ovs0Var.f170557a) && wj50.m88271j(this.f170558b, ovs0Var.f170558b) && wj50.m88271j(this.f170559c, ovs0Var.f170559c) && this.f170560d.equals(ovs0Var.f170560d);
    }

    public final int hashCode() {
        String str = this.f170557a;
        return this.f170560d.hashCode() + s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f170558b), 31, this.f170559c);
    }
}
