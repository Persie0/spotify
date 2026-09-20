package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class puf {

    /* JADX INFO: renamed from: a */
    public final Object f181435a;

    /* JADX INFO: renamed from: b */
    public final yob f181436b;

    /* JADX INFO: renamed from: c */
    public final vh00 f181437c;

    /* JADX INFO: renamed from: d */
    public final Object f181438d;

    /* JADX INFO: renamed from: e */
    public final Throwable f181439e;

    public puf(Object obj, yob yobVar, vh00 vh00Var, Object obj2, Throwable th) {
        this.f181435a = obj;
        this.f181436b = yobVar;
        this.f181437c = vh00Var;
        this.f181438d = obj2;
        this.f181439e = th;
    }

    /* JADX INFO: renamed from: a */
    public static puf m71068a(puf pufVar, yob yobVar, Throwable th, int i) {
        Object obj = pufVar.f181435a;
        if ((i & 2) != 0) {
            yobVar = pufVar.f181436b;
        }
        yob yobVar2 = yobVar;
        vh00 vh00Var = pufVar.f181437c;
        Object obj2 = pufVar.f181438d;
        if ((i & 16) != 0) {
            th = pufVar.f181439e;
        }
        return new puf(obj, yobVar2, vh00Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puf)) {
            return false;
        }
        puf pufVar = (puf) obj;
        return wj50.m88271j(this.f181435a, pufVar.f181435a) && wj50.m88271j(this.f181436b, pufVar.f181436b) && wj50.m88271j(this.f181437c, pufVar.f181437c) && wj50.m88271j(this.f181438d, pufVar.f181438d) && wj50.m88271j(this.f181439e, pufVar.f181439e);
    }

    public final int hashCode() {
        Object obj = this.f181435a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        yob yobVar = this.f181436b;
        int iHashCode2 = (iHashCode + (yobVar == null ? 0 : yobVar.hashCode())) * 31;
        vh00 vh00Var = this.f181437c;
        int iHashCode3 = (iHashCode2 + (vh00Var == null ? 0 : vh00Var.hashCode())) * 31;
        Object obj2 = this.f181438d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f181439e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f181435a + ", cancelHandler=" + this.f181436b + ", onCancellation=" + this.f181437c + ", idempotentResume=" + this.f181438d + ", cancelCause=" + this.f181439e + ')';
    }

    public /* synthetic */ puf(Object obj, yob yobVar, vh00 vh00Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : yobVar, (i & 4) != 0 ? null : vh00Var, (Object) null, (i & 16) != 0 ? null : th);
    }
}
