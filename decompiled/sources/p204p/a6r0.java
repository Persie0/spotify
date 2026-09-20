package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class a6r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f12844a;

    /* JADX INFO: renamed from: b */
    public w3k f12845b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f12846c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c6r0 f12847d;

    /* JADX INFO: renamed from: e */
    public int f12848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6r0(c6r0 c6r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f12847d = c6r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12846c = obj;
        this.f12848e |= Integer.MIN_VALUE;
        return this.f12847d.m31588a(null, null, null, false, this);
    }
}
