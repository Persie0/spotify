package p204p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yl91 extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f273960a;

    /* JADX INFO: renamed from: b */
    public Map f273961b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f273962c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cm91 f273963d;

    /* JADX INFO: renamed from: e */
    public int f273964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl91(cm91 cm91Var, ibk ibkVar) {
        super(ibkVar);
        this.f273963d = cm91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273962c = obj;
        this.f273964e |= Integer.MIN_VALUE;
        return cm91.m33368a(this.f273963d, this);
    }
}
