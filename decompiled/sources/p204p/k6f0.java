package p204p;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k6f0 {

    /* JADX INFO: renamed from: a */
    public final a470 f119748a;

    /* JADX INFO: renamed from: b */
    public final suj f119749b;

    /* JADX INFO: renamed from: c */
    public final HashMap f119750c;

    public k6f0(Context context, suj sujVar) {
        a470 a470Var = new a470(context);
        this.f119750c = new HashMap();
        this.f119748a = a470Var;
        this.f119749b = sujVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ed91 m55596a(String str) {
        if (this.f119750c.containsKey(str)) {
            return (ed91) this.f119750c.get(str);
        }
        CctBackendFactory cctBackendFactoryM24680f = this.f119748a.m24680f(str);
        if (cctBackendFactoryM24680f == null) {
            return null;
        }
        ed91 ed91VarCreate = cctBackendFactoryM24680f.create(this.f119749b.m79393e(str));
        this.f119750c.put(str, ed91VarCreate);
        return ed91VarCreate;
    }
}
