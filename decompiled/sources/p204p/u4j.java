package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class u4j extends ibk {

    /* JADX INFO: renamed from: a */
    public String f226734a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f226735b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w4j f226736c;

    /* JADX INFO: renamed from: d */
    public int f226737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4j(w4j w4jVar, ibk ibkVar) {
        super(ibkVar);
        this.f226736c = w4jVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226735b = obj;
        this.f226737d |= Integer.MIN_VALUE;
        Serializable serializableM87199a = this.f226736c.m87199a(null, this);
        return serializableM87199a == yuk.f276404a ? serializableM87199a : new s6x0(serializableM87199a);
    }
}
