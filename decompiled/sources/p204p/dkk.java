package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class dkk extends ibk {

    /* JADX INFO: renamed from: a */
    public List f49984a;

    /* JADX INFO: renamed from: b */
    public List f49985b;

    /* JADX INFO: renamed from: c */
    public Map f49986c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f49987d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ suj f49988e;

    /* JADX INFO: renamed from: f */
    public int f49989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkk(suj sujVar, ibk ibkVar) {
        super(ibkVar);
        this.f49988e = sujVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49987d = obj;
        this.f49989f |= Integer.MIN_VALUE;
        return this.f49988e.m79394f(null, this);
    }
}
