package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vps extends ibk {

    /* JADX INFO: renamed from: a */
    public Iterator f243764a;

    /* JADX INFO: renamed from: b */
    public LinkedHashMap f243765b;

    /* JADX INFO: renamed from: c */
    public xps f243766c;

    /* JADX INFO: renamed from: d */
    public int f243767d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f243768e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wps f243769f;

    /* JADX INFO: renamed from: g */
    public int f243770g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vps(wps wpsVar, ibk ibkVar) {
        super(ibkVar);
        this.f243769f = wpsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243768e = obj;
        this.f243770g |= Integer.MIN_VALUE;
        return this.f243769f.m88724c(null, this);
    }
}
