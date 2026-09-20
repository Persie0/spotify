package p204p;

import android.graphics.BitmapFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class n0i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Iterator f149090a;

    /* JADX INFO: renamed from: b */
    public String f149091b;

    /* JADX INFO: renamed from: c */
    public BitmapFactory.Options f149092c;

    /* JADX INFO: renamed from: d */
    public int f149093d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f149094e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ o0i0 f149095f;

    /* JADX INFO: renamed from: g */
    public int f149096g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0i0(o0i0 o0i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f149095f = o0i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149094e = obj;
        this.f149096g |= Integer.MIN_VALUE;
        return this.f149095f.m66021d(null, 0, this);
    }
}
