package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes9.dex */
public final class xz61 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267529a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f267530b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f267531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz61(Context context, gh00 gh00Var) {
        super(1);
        this.f267530b = context;
        this.f267531c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f267529a) {
            case 0:
                String str = (String) obj;
                this.f267531c.invoke(new tz61(str));
                this.f267530b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                break;
            default:
                String str2 = (String) obj;
                Context context = this.f267530b;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    break;
                } catch (Exception unused) {
                }
                this.f267531c.invoke(str2);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz61(gh00 gh00Var, Context context) {
        super(1);
        this.f267531c = gh00Var;
        this.f267530b = context;
    }
}
