package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ns11 extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f157643a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f157644b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ spx f157645c;

    /* JADX INFO: renamed from: d */
    public int f157646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns11(spx spxVar, ibk ibkVar) {
        super(ibkVar);
        this.f157645c = spxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157644b = obj;
        this.f157646d |= Integer.MIN_VALUE;
        return this.f157645c.m78924b(null, this);
    }
}
