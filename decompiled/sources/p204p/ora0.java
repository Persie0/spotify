package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ora0 {

    /* JADX INFO: renamed from: a */
    public final Context f168516a;

    /* JADX INFO: renamed from: b */
    public final luk f168517b;

    /* JADX INFO: renamed from: c */
    public final wg61 f168518c = new wg61(new t790(this, 21));

    /* JADX INFO: renamed from: d */
    public String f168519d;

    public ora0(Context context, luk lukVar) {
        this.f168516a = context;
        this.f168517b = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m67689a(gh00 gh00Var) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f168518c.getValue();
        if (sharedPreferences == null) {
            return;
        }
        Set<String> set = gbu.f78413a;
        Set<String> stringSet = sharedPreferences.getStringSet("logged_out_usernames", set);
        if (stringSet != null) {
            set = stringSet;
        }
        Set setM43736n1 = g6f.m43736n1(set);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet("logged_out_usernames", (Set) gh00Var.invoke(setM43736n1));
        editorEdit.apply();
    }
}
