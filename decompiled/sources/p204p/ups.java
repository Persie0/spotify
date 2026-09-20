package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ups extends ibk {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f232815a;

    /* JADX INFO: renamed from: b */
    public xps f232816b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f232817c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wps f232818d;

    /* JADX INFO: renamed from: e */
    public int f232819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ups(wps wpsVar, fbk fbkVar) {
        super(fbkVar);
        this.f232818d = wpsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232817c = obj;
        this.f232819e |= Integer.MIN_VALUE;
        return this.f232818d.m88723b(null, this);
    }
}
