package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class u3y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public fws f226485a;

    /* JADX INFO: renamed from: b */
    public List f226486b;

    /* JADX INFO: renamed from: c */
    public Iterator f226487c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f226488d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ w3y0 f226489e;

    /* JADX INFO: renamed from: f */
    public int f226490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3y0(w3y0 w3y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f226489e = w3y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226488d = obj;
        this.f226490f |= Integer.MIN_VALUE;
        return this.f226489e.m87117a(null, this);
    }
}
