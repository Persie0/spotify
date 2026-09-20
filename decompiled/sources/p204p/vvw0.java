package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vvw0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f245346a;

    /* JADX INFO: renamed from: b */
    public final String f245347b;

    /* JADX INFO: renamed from: c */
    public final int f245348c;

    public vvw0(int i, String str, ArrayList arrayList) {
        this.f245346a = arrayList;
        this.f245347b = str;
        this.f245348c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvw0)) {
            return false;
        }
        vvw0 vvw0Var = (vvw0) obj;
        return this.f245346a.equals(vvw0Var.f245346a) && wj50.m88271j(this.f245347b, vvw0Var.f245347b) && this.f245348c == vvw0Var.f245348c;
    }

    public final int hashCode() {
        int iHashCode = this.f245346a.hashCode() * 31;
        String str = this.f245347b;
        return Integer.hashCode(this.f245348c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionRequest(permissions=");
        sb.append(this.f245346a);
        sb.append(", rationale=");
        sb.append(this.f245347b);
        sb.append(", deviceId=");
        return klh.m56832d(this.f245348c, ")", sb);
    }
}
