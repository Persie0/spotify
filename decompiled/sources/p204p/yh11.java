package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class yh11 {

    /* JADX INFO: renamed from: a */
    public final zh11 f272714a;

    public yh11(Context context, String str) {
        zh11 zh11Var = new zh11();
        this.f272714a = zh11Var;
        zh11Var.f282766a = context;
        zh11Var.f282767b = str;
    }

    /* JADX INFO: renamed from: a */
    public final zh11 m93617a() {
        zh11 zh11Var = this.f272714a;
        if (TextUtils.isEmpty(zh11Var.f282770e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = zh11Var.f282768c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return zh11Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m93618b(IconCompat iconCompat) {
        this.f272714a.f282773h = iconCompat;
    }

    /* JADX INFO: renamed from: c */
    public final void m93619c(Intent intent) {
        this.f272714a.f282768c = new Intent[]{intent};
    }

    /* JADX INFO: renamed from: d */
    public final void m93620d() {
        this.f272714a.f282777l = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m93621e(CharSequence charSequence) {
        this.f272714a.f282770e = charSequence;
    }

    public yh11(Context context, ShortcutInfo shortcutInfo) {
        nsn0[] nsn0VarArr;
        String string;
        zh11 zh11Var = new zh11();
        this.f272714a = zh11Var;
        zh11Var.f282766a = context;
        zh11Var.f282767b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        zh11Var.f282768c = (Intent[]) Arrays.copyOf(intents, intents.length);
        zh11Var.f282769d = shortcutInfo.getActivity();
        zh11Var.f282770e = shortcutInfo.getShortLabel();
        zh11Var.f282771f = shortcutInfo.getLongLabel();
        zh11Var.f282772g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        zh11Var.f282775j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        kpa0 kpa0Var = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            nsn0VarArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            nsn0VarArr = new nsn0[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string2 = persistableBundle.getString("name");
                String string3 = persistableBundle.getString("uri");
                String string4 = persistableBundle.getString("key");
                boolean z = persistableBundle.getBoolean("isBot");
                boolean z2 = persistableBundle.getBoolean("isImportant");
                nsn0 nsn0Var = new nsn0();
                nsn0Var.f157848a = string2;
                nsn0Var.f157849b = null;
                nsn0Var.f157850c = string3;
                nsn0Var.f157851d = string4;
                nsn0Var.f157852e = z;
                nsn0Var.f157853f = z2;
                nsn0VarArr[i2] = nsn0Var;
                i2 = i3;
            }
        }
        zh11Var.f282774i = nsn0VarArr;
        shortcutInfo.getUserHandle();
        this.f272714a.f282780o = shortcutInfo.getLastChangedTimestamp();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        zh11 zh11Var2 = this.f272714a;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                wj50.m88280q(locusId, "locusId cannot be null");
                String id = locusId.getId();
                if (!TextUtils.isEmpty(id)) {
                    kpa0Var = new kpa0(id);
                } else {
                    throw new IllegalArgumentException("id cannot be empty");
                }
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                kpa0Var = new kpa0(string);
            }
        }
        zh11Var2.f282776k = kpa0Var;
        this.f272714a.f282778m = shortcutInfo.getRank();
        this.f272714a.f282779n = shortcutInfo.getExtras();
    }
}
