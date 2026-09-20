package p204p;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.C0043a;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyCycle;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.KeyTimeCycle;
import androidx.constraintlayout.motion.widget.KeyTrigger;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class gu60 {

    /* JADX INFO: renamed from: b */
    public static final HashMap f84382b;

    /* JADX INFO: renamed from: a */
    public HashMap f84383a = new HashMap();

    static {
        HashMap map = new HashMap();
        f84382b = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            map.put("KeyPosition", KeyPosition.class.getConstructor(null));
            map.put("KeyCycle", KeyCycle.class.getConstructor(null));
            map.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            map.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public gu60(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        HashMap map2;
        try {
            int eventType = xmlResourceParser.getEventType();
            pt60 pt60Var = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map3 = f84382b;
                    if (map3.containsKey(name)) {
                        try {
                            Constructor constructor = (Constructor) map3.get(name);
                            if (constructor == null) {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                            pt60 pt60Var2 = (pt60) constructor.newInstance(null);
                            try {
                                pt60Var2.mo319e(context, Xml.asAttributeSet(xmlResourceParser));
                                m45726b(pt60Var2);
                            } catch (Exception unused) {
                            }
                            pt60Var = pt60Var2;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (pt60Var != null && (map2 = pt60Var.f181056d) != null) {
                            d6j.m35116e(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && pt60Var != null && (map = pt60Var.f181056d) != null) {
                        d6j.m35116e(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m45725a(C0043a c0043a) {
        ArrayList arrayList = c0043a.f720w;
        HashMap map = this.f84383a;
        ArrayList arrayList2 = (ArrayList) map.get(Integer.valueOf(c0043a.f700c));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList<pt60> arrayList3 = (ArrayList) map.get(-1);
        if (arrayList3 != null) {
            for (pt60 pt60Var : arrayList3) {
                String str = ((h6j) c0043a.f699b.getLayoutParams()).f88127Y;
                String str2 = pt60Var.f181055c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    arrayList.add(pt60Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m45726b(pt60 pt60Var) {
        HashMap map = this.f84383a;
        if (!map.containsKey(Integer.valueOf(pt60Var.f181054b))) {
            map.put(Integer.valueOf(pt60Var.f181054b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(pt60Var.f181054b));
        if (arrayList != null) {
            arrayList.add(pt60Var);
        }
    }
}
