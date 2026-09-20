package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity;

/* JADX INFO: renamed from: p.zu */
/* JADX INFO: loaded from: classes.dex */
public final class C2663zu {
    /* JADX INFO: renamed from: a */
    public static Intent m96956a(C2663zu c2663zu, Context context, String str, String str2, String str3) {
        c2663zu.getClass();
        Intent intent = new Intent();
        intent.putExtra("account_switch_action", new C2548wu(str, str2, str3));
        intent.setClass(context, AccountSwitcherActivity.class);
        intent.setFlags(268468224);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m96957b(C2663zu c2663zu, Activity activity, String str) {
        c2663zu.getClass();
        Intent intent = new Intent();
        intent.putExtra("account_switch_action", new C2589xu(str));
        intent.setClass(activity, AccountSwitcherActivity.class);
        intent.setFlags(268468224);
        return intent;
    }
}
