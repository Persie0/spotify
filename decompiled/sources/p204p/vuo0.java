package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vuo0 {

    /* JADX INFO: renamed from: a */
    public final String f245035a;

    /* JADX INFO: renamed from: b */
    public final String f245036b;

    /* JADX INFO: renamed from: c */
    public final String f245037c;

    /* JADX INFO: renamed from: d */
    public final Object f245038d;

    /* JADX INFO: renamed from: e */
    public final String f245039e;

    /* JADX INFO: renamed from: f */
    public final boolean f245040f;

    /* JADX INFO: renamed from: g */
    public final boolean f245041g;

    /* JADX INFO: renamed from: h */
    public final boolean f245042h;

    public vuo0(String str, String str2, String str3, List list, String str4, boolean z, boolean z2, boolean z3) {
        this.f245035a = str;
        this.f245036b = str2;
        this.f245037c = str3;
        this.f245038d = list;
        this.f245039e = str4;
        this.f245040f = z;
        this.f245041g = z2;
        this.f245042h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuo0)) {
            return false;
        }
        vuo0 vuo0Var = (vuo0) obj;
        return wj50.m88271j(this.f245035a, vuo0Var.f245035a) && wj50.m88271j(this.f245036b, vuo0Var.f245036b) && wj50.m88271j(this.f245037c, vuo0Var.f245037c) && this.f245038d.equals(vuo0Var.f245038d) && this.f245039e.equals(vuo0Var.f245039e) && this.f245040f == vuo0Var.f245040f && this.f245041g == vuo0Var.f245041g && this.f245042h == vuo0Var.f245042h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245042h) + s571.m77245d(s571.m77245d((uro0.f233418c.hashCode() + s571.m77245d(s571.m77243b(dq60.m36604d(s571.m77243b(s571.m77243b(this.f245035a.hashCode() * 31, 31, this.f245036b), 31, this.f245037c), 31, this.f245038d), 31, this.f245039e), 31, this.f245040f)) * 31, 31, true), 31, this.f245041g);
    }
}
