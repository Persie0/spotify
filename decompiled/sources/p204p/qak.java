package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qak implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f186893a;

    public qak(ae50 ae50Var) {
        this.f186893a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qak) && wj50.m88271j(this.f186893a, ((qak) obj).f186893a);
    }

    public final int hashCode() {
        return this.f186893a.hashCode();
    }
}
