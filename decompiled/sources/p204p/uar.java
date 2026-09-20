package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class uar extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f228532a;

    /* JADX INFO: renamed from: b */
    public Iterator f228533b;

    /* JADX INFO: renamed from: c */
    public int f228534c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f228535d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ yar f228536e;

    /* JADX INFO: renamed from: f */
    public int f228537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uar(yar yarVar, fbk fbkVar) {
        super(fbkVar);
        this.f228536e = yarVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228535d = obj;
        this.f228537f |= Integer.MIN_VALUE;
        return yar.m93216c(this.f228536e, false, this);
    }
}
