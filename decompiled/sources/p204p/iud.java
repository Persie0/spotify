package p204p;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class iud implements fud {

    /* JADX INFO: renamed from: d */
    public static final fv31 f105939d;

    /* JADX INFO: renamed from: e */
    public static final fv31 f105940e;

    /* JADX INFO: renamed from: f */
    public static final fv31 f105941f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f105942g;

    /* JADX INFO: renamed from: h */
    public static final fv31 f105943h;

    /* JADX INFO: renamed from: i */
    public static final fv31 f105944i;

    /* JADX INFO: renamed from: j */
    public static final fv31 f105945j;

    /* JADX INFO: renamed from: a */
    public final xre f105946a;

    /* JADX INFO: renamed from: b */
    public final hv31 f105947b;

    /* JADX INFO: renamed from: c */
    public final wg61 f105948c = new wg61(new fub(this, 23));

    static {
        si5 si5Var = fv31.f73628b;
        f105939d = si5Var.m78183U("share_history_disclaimer_accepted");
        f105940e = si5Var.m78183U("share_history_banner_shown_count");
        f105941f = si5Var.m78183U("notifications_dialog_shown_ignored");
        f105942g = si5Var.m78183U("notifications_dialog_shown_chats");
        f105943h = si5Var.m78183U("listening_activity_prompt_dismissed_chats");
        f105944i = si5Var.m78183U("listening_activity_prompt_dismiss_count");
        f105945j = si5Var.m78183U("chat_draft_texts");
    }

    public iud(Context context, xre xreVar, String str, vnb vnbVar) {
        this.f105946a = xreVar;
        this.f105947b = vnbVar.f243033b.mo35842b(context, str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51659a(String str) {
        hv31 hv31Var = this.f105947b;
        boolean zMo48713h = hv31Var.mo48713h(f105941f, false);
        fv31 fv31Var = f105942g;
        Set set = gbu.f78413a;
        Set setMo48707b = hv31Var.mo48707b(fv31Var, set);
        if (setMo48707b != null) {
            set = setMo48707b;
        }
        return !zMo48713h && (set.size() < 3 && !set.contains(str));
    }

    /* JADX INFO: renamed from: b */
    public final Map m51660b() {
        String strMo48710e = this.f105947b.mo48710e(f105945j, null);
        if (strMo48710e != null) {
            try {
                Map map = zk60.m96308j(fk60.f70476d.m41882c(strMo48710e)).f155012a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Object obj : map.entrySet()) {
                    Object key = ((Map.Entry) obj).getKey();
                    nl60 nl60VarM96308j = zk60.m96308j((yk60) ((Map.Entry) obj).getValue());
                    Object obj2 = nl60VarM96308j.get("text");
                    wj50.m88279p(obj2);
                    String strMo47869a = zk60.m96309k((yk60) obj2).mo47869a();
                    Object obj3 = nl60VarM96308j.get("savedAt");
                    wj50.m88279p(obj3);
                    try {
                        linkedHashMap.put(key, new gud(strMo47869a, zk60.m96310l(zk60.m96309k((yk60) obj3))));
                    } catch (JsonDecodingException e) {
                        throw new NumberFormatException(e.getF10921a());
                    }
                }
                return linkedHashMap;
            } catch (Exception unused) {
            }
        }
        return nau.f152117a;
    }

    /* JADX INFO: renamed from: c */
    public final void m51661c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            gud gudVar = (gud) entry.getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        }
        nl60 nl60Var = new nl60(linkedHashMap2);
        lv31 lv31VarEdit = this.f105947b.edit();
        lv31VarEdit.m60051d(f105945j, nl60Var.toString());
        lv31VarEdit.m60054g();
    }
}
