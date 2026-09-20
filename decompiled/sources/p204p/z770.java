package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z770 extends h870 {
    /* JADX INFO: renamed from: a */
    public abstract Object mo25032a();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof c870) {
            string = "\"" + ((Object) ((c870) this).f35129a) + '\"';
        } else {
            string = mo25032a().toString();
        }
        return dq60.m36617q(sb, string, ')');
    }
}
