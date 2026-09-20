package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class xfy extends ibk {

    /* JADX INFO: renamed from: a */
    public Map f261116a;

    /* JADX INFO: renamed from: b */
    public LinkedHashMap f261117b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f261118c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ yfy f261119d;

    /* JADX INFO: renamed from: e */
    public int f261120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfy(yfy yfyVar, ibk ibkVar) {
        super(ibkVar);
        this.f261119d = yfyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261118c = obj;
        this.f261120e |= Integer.MIN_VALUE;
        return yfy.m93571a(this.f261119d, null, this);
    }
}
