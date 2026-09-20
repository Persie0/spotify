package p204p;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ytj0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f276131a;

    /* JADX INFO: renamed from: b */
    public final long f276132b;

    /* JADX INFO: renamed from: c */
    public final nsn0 f276133c;

    /* JADX INFO: renamed from: d */
    public final Bundle f276134d = new Bundle();

    /* JADX INFO: renamed from: e */
    public String f276135e;

    /* JADX INFO: renamed from: f */
    public Uri f276136f;

    public ytj0(CharSequence charSequence, long j, nsn0 nsn0Var) {
        this.f276131a = charSequence;
        this.f276132b = j;
        this.f276133c = nsn0Var;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle[] m94636a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ytj0 ytj0Var = (ytj0) arrayList.get(i);
            nsn0 nsn0Var = ytj0Var.f276133c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = ytj0Var.f276131a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", ytj0Var.f276132b);
            if (nsn0Var != null) {
                bundle.putCharSequence("sender", nsn0Var.f157848a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", xtj0.m92052a(t35.m79963c(nsn0Var)));
                } else {
                    bundle.putBundle("person", nsn0Var.m65578i());
                }
            }
            String str = ytj0Var.f276135e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = ytj0Var.f276136f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = ytj0Var.f276134d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m94637b(Parcelable[] parcelableArr) {
        nsn0 nsn0VarM79961a;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                ytj0 ytj0Var = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            nsn0VarM79961a = nsn0.m65570a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            nsn0VarM79961a = t35.m79961a((Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            nsn0 nsn0Var = new nsn0();
                            nsn0Var.f157848a = charSequence;
                            nsn0Var.f157849b = null;
                            nsn0Var.f157850c = null;
                            nsn0Var.f157851d = null;
                            nsn0Var.f157852e = false;
                            nsn0Var.f157853f = false;
                            nsn0VarM79961a = nsn0Var;
                        } else {
                            nsn0VarM79961a = null;
                        }
                        ytj0 ytj0Var2 = new ytj0(bundle.getCharSequence("text"), bundle.getLong("time"), nsn0VarM79961a);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            ytj0Var2.f276135e = string;
                            ytj0Var2.f276136f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            ytj0Var2.f276134d.putAll(bundle.getBundle("extras"));
                        }
                        ytj0Var = ytj0Var2;
                    }
                } catch (ClassCastException unused) {
                }
                if (ytj0Var != null) {
                    arrayList.add(ytj0Var);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final Notification.MessagingStyle.Message m94638c() {
        Notification.MessagingStyle.Message messageM88952a;
        int i = Build.VERSION.SDK_INT;
        long j = this.f276132b;
        CharSequence charSequence = this.f276131a;
        nsn0 nsn0Var = this.f276133c;
        if (i >= 28) {
            messageM88952a = xtj0.m92053b(charSequence, j, nsn0Var != null ? t35.m79963c(nsn0Var) : null);
        } else {
            messageM88952a = wtj0.m88952a(charSequence, j, nsn0Var != null ? nsn0Var.f157848a : null);
        }
        String str = this.f276135e;
        if (str != null) {
            wtj0.m88953b(messageM88952a, str, this.f276136f);
        }
        return messageM88952a;
    }
}
