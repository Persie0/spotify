package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class peu {

    /* JADX INFO: renamed from: a */
    public final mqg1 f176848a;

    /* JADX INFO: renamed from: b */
    public final eh00 f176849b;

    /* JADX INFO: renamed from: c */
    public final String f176850c;

    /* JADX INFO: renamed from: d */
    public final wg61 f176851d;

    public peu(mqg1 mqg1Var, eh00 eh00Var) {
        String str;
        this.f176848a = mqg1Var;
        this.f176849b = eh00Var;
        if (mqg1Var instanceof t40) {
            str = ((t40) mqg1Var).f216871c;
        } else {
            if (!wj50.m88271j(mqg1Var, u40.f226523c)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        this.f176850c = str;
        this.f176851d = new wg61(new ias(this, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof peu)) {
            return false;
        }
        peu peuVar = (peu) obj;
        return wj50.m88271j(this.f176848a, peuVar.f176848a) && wj50.m88271j(this.f176849b, peuVar.f176849b);
    }

    public final int hashCode() {
        return this.f176849b.hashCode() + (this.f176848a.hashCode() * 31);
    }
}
