package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k05 {

    /* JADX INFO: renamed from: a */
    public final q05 f117889a;

    /* JADX INFO: renamed from: b */
    public final int f117890b;

    public k05(int i, q05 q05Var) {
        this.f117889a = q05Var;
        this.f117890b = i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i = this.f117890b;
        if (i != 1) {
            str = i != 2 ? "null" : "Finished";
        } else {
            str = "BoundReached";
        }
        sb.append(str);
        sb.append(", endState=");
        sb.append(this.f117889a);
        sb.append(')');
        return sb.toString();
    }
}
