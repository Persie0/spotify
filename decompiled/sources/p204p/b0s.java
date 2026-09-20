package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class b0s extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f22091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f22092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0s(int i, Context context, String str) {
        super(1);
        this.f22090a = i;
        this.f22091b = context;
        this.f22092c = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f22090a) {
            case 0:
                this.f22091b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f22092c)));
                return w2a1.f247311a;
            case 1:
                this.f22091b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f22092c)));
                return w2a1.f247311a;
            default:
                return FileProvider.getUriForFile(this.f22091b, this.f22092c, (File) obj);
        }
    }
}
