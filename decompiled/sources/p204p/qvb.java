package p204p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class qvb implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f192956b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f192957c;

    public /* synthetic */ qvb(int i, Object obj, Object obj2) {
        this.f192955a = i;
        this.f192956b = obj;
        this.f192957c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f192955a) {
            case 0:
                ((gh00) this.f192956b).invoke((nvb) this.f192957c);
                break;
            case 1:
                ((gh00) this.f192956b).invoke(new hjv(((hlv) this.f192957c).f92755e));
                break;
            default:
                try {
                    ((Context) this.f192956b).startActivity((Intent) this.f192957c);
                } catch (ActivityNotFoundException unused) {
                    return;
                }
                break;
        }
    }
}
