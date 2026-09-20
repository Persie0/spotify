package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class s6f1 extends ywh0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ntx0 f206122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6f1(ntx0 ntx0Var, Looper looper) {
        super(looper, 4, false);
        this.f206122b = ntx0Var;
    }

    @Override // p204p.ywh0, android.os.Handler
    public final void handleMessage(Message message) {
        ntx0 ntx0Var = this.f206122b;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new vmf1());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof qrf1) {
                        ntx0Var.f158453g = (qrf1) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        ntx0Var.f158452f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        if (strValueOf.length() != 0) {
                            "Unexpected response action: ".concat(strValueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = ntx0.f158446j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (!Log.isLoggable("Rpc", 3) || stringExtra.length() == 0) {
                            return;
                        }
                        "Unexpected response string: ".concat(stringExtra);
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        ntx0Var.m65646b(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    new StringBuilder(String.valueOf(intent2.getExtras()).length() + 49);
                    return;
                }
                if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (ntx0Var.f158447a) {
                        int i = 0;
                        while (true) {
                            try {
                                ab21 ab21Var = ntx0Var.f158447a;
                                if (i < ab21Var.f13976c) {
                                    ntx0Var.m65646b((String) ab21Var.m25312f(i), intent2.getExtras());
                                    i++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    if (stringExtra2.length() != 0) {
                        "Unexpected structured response ".concat(stringExtra2);
                    }
                } else {
                    String str = strArrSplit[2];
                    String strSubstring = strArrSplit[3];
                    if (strSubstring.startsWith(":")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    ntx0Var.m65646b(str, intent2.putExtra("error", strSubstring).getExtras());
                }
            }
        }
    }
}
