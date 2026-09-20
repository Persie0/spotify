package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class id31 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f100928a;

    /* JADX INFO: renamed from: b */
    public gk40 f100929b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f100930c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ md31 f100931d;

    /* JADX INFO: renamed from: e */
    public int f100932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id31(md31 md31Var, ibk ibkVar) {
        super(ibkVar);
        this.f100931d = md31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100930c = obj;
        this.f100932e |= Integer.MIN_VALUE;
        return this.f100931d.m61504a(null, this);
    }
}
