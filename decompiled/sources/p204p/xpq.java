package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class xpq implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f264705a;

    /* JADX INFO: renamed from: b */
    public final int f264706b;

    /* JADX INFO: renamed from: c */
    public final th00 f264707c;

    public xpq(CharSequence charSequence, int i, th00 th00Var) {
        this.f264705a = charSequence;
        this.f264706b = i;
        this.f264707c = th00Var;
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        return new wpq(this);
    }
}
