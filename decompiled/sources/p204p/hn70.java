package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class hn70 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93228a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f93229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f93230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn70(kqi0 kqi0Var, Context context, int i) {
        super(0);
        this.f93228a = i;
        this.f93229b = kqi0Var;
        this.f93230c = context;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f93228a) {
            case 0:
                this.f93229b.setValue(Boolean.FALSE);
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context = this.f93230c;
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent);
                break;
            case 1:
                this.f93229b.setValue(Boolean.FALSE);
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context2 = this.f93230c;
                intent2.setData(Uri.fromParts("package", context2.getPackageName(), null));
                context2.startActivity(intent2);
                break;
            default:
                this.f93229b.setValue(Boolean.FALSE);
                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                Context context3 = this.f93230c;
                intent3.setData(Uri.fromParts("package", context3.getPackageName(), null));
                context3.startActivity(intent3);
                break;
        }
        return w2a1.f247311a;
    }
}
