package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.spotify.playbacknative.AudioDriver;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class r561 extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f195973e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f195974f;

    /* JADX INFO: renamed from: a */
    public final Object[] f195975a;

    /* JADX INFO: renamed from: b */
    public final Object[] f195976b;

    /* JADX INFO: renamed from: c */
    public final Context f195977c;

    /* JADX INFO: renamed from: d */
    public Object f195978d;

    static {
        Class[] clsArr = {Context.class};
        f195973e = clsArr;
        f195974f = clsArr;
    }

    public r561(Context context) {
        super(context);
        this.f195977c = context;
        Object[] objArr = {context};
        this.f195975a = objArr;
        this.f195976b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m74804a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m74804a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m74805b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        q561 q561Var = new q561(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f195977c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3u0.f87336p);
                        q561Var.f185420b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        q561Var.f185421c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        q561Var.f185422d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        q561Var.f185423e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        q561Var.f185424f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        q561Var.f185425g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        cx21 cx21VarM34177I = cx21.m34177I(context, attributeSet, h3u0.f87337q);
                        TypedArray typedArray = (TypedArray) cx21VarM34177I.f42890c;
                        q561Var.f185427i = typedArray.getResourceId(2, 0);
                        q561Var.f185428j = (typedArray.getInt(5, q561Var.f185421c) & (-65536)) | (typedArray.getInt(6, q561Var.f185422d) & AudioDriver.SPOTIFY_MAX_VOLUME);
                        q561Var.f185429k = typedArray.getText(7);
                        q561Var.f185430l = typedArray.getText(8);
                        q561Var.f185431m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        q561Var.f185432n = string == null ? (char) 0 : string.charAt(0);
                        q561Var.f185433o = typedArray.getInt(16, 4096);
                        String string2 = typedArray.getString(10);
                        q561Var.f185434p = string2 == null ? (char) 0 : string2.charAt(0);
                        q561Var.f185435q = typedArray.getInt(20, 4096);
                        if (typedArray.hasValue(11)) {
                            q561Var.f185436r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            q561Var.f185436r = q561Var.f185423e;
                        }
                        q561Var.f185437s = typedArray.getBoolean(3, false);
                        q561Var.f185438t = typedArray.getBoolean(4, q561Var.f185424f);
                        q561Var.f185439u = typedArray.getBoolean(1, q561Var.f185425g);
                        q561Var.f185440v = typedArray.getInt(21, -1);
                        q561Var.f185443y = typedArray.getString(12);
                        q561Var.f185441w = typedArray.getResourceId(13, 0);
                        q561Var.f185442x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        if (string3 != null && q561Var.f185441w == 0 && q561Var.f185442x == null) {
                            q561Var.f185444z = (q50) q561Var.m72189a(string3, f195974f, this.f195976b);
                        } else {
                            q561Var.f185444z = null;
                        }
                        q561Var.f185414A = typedArray.getText(17);
                        q561Var.f185415B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            q561Var.f185417D = cgs.m32736c(typedArray.getInt(19, -1), q561Var.f185417D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            q561Var.f185417D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            q561Var.f185416C = cx21VarM34177I.m34198g(18);
                        } else {
                            q561Var.f185416C = colorStateList;
                        }
                        cx21VarM34177I.m34189K();
                        q561Var.f185426h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        q561Var.f185426h = true;
                        SubMenu subMenuAddSubMenu = q561Var.f185419a.addSubMenu(q561Var.f185420b, q561Var.f185427i, q561Var.f185428j, q561Var.f185429k);
                        q561Var.m72190b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        m74805b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        q561Var.f185420b = 0;
                        q561Var.f185421c = 0;
                        q561Var.f185422d = 0;
                        q561Var.f185423e = 0;
                        q561Var.f185424f = true;
                        q561Var.f185425g = true;
                    } else if (name3.equals("item")) {
                        if (!q561Var.f185426h) {
                            q50 q50Var = q561Var.f185444z;
                            if (q50Var == null || !q50Var.mo64474a()) {
                                q561Var.f185426h = true;
                                q561Var.m72190b(q561Var.f185419a.add(q561Var.f185420b, q561Var.f185427i, q561Var.f185428j, q561Var.f185429k));
                            } else {
                                q561Var.f185426h = true;
                                q561Var.m72190b(q561Var.f185419a.addSubMenu(q561Var.f185420b, q561Var.f185427i, q561Var.f185428j, q561Var.f185429k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof zge0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f195977c.getResources().getLayout(i);
                    m74805b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
