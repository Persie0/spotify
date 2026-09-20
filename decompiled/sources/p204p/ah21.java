package p204p;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ah21 extends ibk {

    /* JADX INFO: renamed from: a */
    public bh21 f15582a;

    /* JADX INFO: renamed from: b */
    public File f15583b;

    /* JADX INFO: renamed from: c */
    public FileOutputStream f15584c;

    /* JADX INFO: renamed from: d */
    public FileOutputStream f15585d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15586e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ bh21 f15587f;

    /* JADX INFO: renamed from: g */
    public int f15588g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah21(bh21 bh21Var, ibk ibkVar) {
        super(ibkVar);
        this.f15587f = bh21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15586e = obj;
        this.f15588g |= Integer.MIN_VALUE;
        return this.f15587f.m29198j(null, this);
    }
}
