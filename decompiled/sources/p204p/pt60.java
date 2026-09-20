package p204p;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pt60 {

    /* JADX INFO: renamed from: a */
    public int f181053a = -1;

    /* JADX INFO: renamed from: b */
    public int f181054b = -1;

    /* JADX INFO: renamed from: c */
    public String f181055c = null;

    /* JADX INFO: renamed from: d */
    public HashMap f181056d;

    /* JADX INFO: renamed from: a */
    public abstract void mo316a(HashMap map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract pt60 clone();

    /* JADX INFO: renamed from: c */
    public pt60 m70909c(pt60 pt60Var) {
        this.f181053a = pt60Var.f181053a;
        this.f181054b = pt60Var.f181054b;
        this.f181055c = pt60Var.f181055c;
        this.f181056d = pt60Var.f181056d;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo318d(HashSet hashSet);

    /* JADX INFO: renamed from: e */
    public abstract void mo319e(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: f */
    public void mo320f(HashMap map) {
    }
}
