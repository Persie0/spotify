package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.comscore.streaming.ContentType;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c7j {

    /* JADX INFO: renamed from: h */
    public static final int[] f34929h = {0, 4, 8};

    /* JADX INFO: renamed from: i */
    public static final SparseIntArray f34930i;

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f34931j;

    /* JADX INFO: renamed from: a */
    public String f34932a;

    /* JADX INFO: renamed from: b */
    public String f34933b = "";

    /* JADX INFO: renamed from: c */
    public String[] f34934c = new String[0];

    /* JADX INFO: renamed from: d */
    public int f34935d = 0;

    /* JADX INFO: renamed from: e */
    public final HashMap f34936e = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f34937f = true;

    /* JADX INFO: renamed from: g */
    public final HashMap f34938g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34930i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f34931j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(Error.INVALID_COUNTRY_FIELD_NUMBER, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(Error.TOO_YOUNG_FIELD_NUMBER, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, 67);
        sparseIntArray.append(ContentType.LIVE, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(ContentType.LONG_FORM_ON_DEMAND, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(ContentType.SHORT_FORM_ON_DEMAND, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(ContentType.USER_GENERATED_LIVE, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(Error.INVALID_COUNTRY_FIELD_NUMBER, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(Error.TOO_YOUNG_FIELD_NUMBER, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: d */
    public static x6j m31724d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        x6j x6jVar = new x6j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, b2u0.f22699c);
        m31730s(x6jVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return x6jVar;
    }

    /* JADX INFO: renamed from: j */
    public static int[] m31725j(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = u0u0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f730N0;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f730N0.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: k */
    public static x6j m31726k(Context context, AttributeSet attributeSet, boolean z) {
        x6j x6jVar = new x6j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? b2u0.f22699c : b2u0.f22697a);
        if (z) {
            m31730s(x6jVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i = 0;
            while (true) {
                y6j y6jVar = x6jVar.f258686e;
                if (i < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    a7j a7jVar = x6jVar.f258684c;
                    b7j b7jVar = x6jVar.f258687f;
                    z6j z6jVar = x6jVar.f258685d;
                    if (index != 1 && 23 != index && 24 != index) {
                        z6jVar.f279926a = true;
                        y6jVar.f269823b = true;
                        a7jVar.f13060a = true;
                        b7jVar.f24285a = true;
                    }
                    SparseIntArray sparseIntArray = f34930i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            y6jVar.f269853q = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269853q);
                            break;
                        case 2:
                            y6jVar.f269804J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269804J);
                            break;
                        case 3:
                            y6jVar.f269851p = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269851p);
                            break;
                        case 4:
                            y6jVar.f269849o = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269849o);
                            break;
                        case 5:
                            y6jVar.f269862z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            y6jVar.f269798D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, y6jVar.f269798D);
                            break;
                        case 7:
                            y6jVar.f269799E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, y6jVar.f269799E);
                            break;
                        case 8:
                            y6jVar.f269805K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269805K);
                            break;
                        case 9:
                            y6jVar.f269859w = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269859w);
                            break;
                        case 10:
                            y6jVar.f269858v = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269858v);
                            break;
                        case 11:
                            y6jVar.f269811Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269811Q);
                            break;
                        case 12:
                            y6jVar.f269812R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269812R);
                            break;
                        case 13:
                            y6jVar.f269808N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269808N);
                            break;
                        case 14:
                            y6jVar.f269810P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269810P);
                            break;
                        case 15:
                            y6jVar.f269813S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269813S);
                            break;
                        case 16:
                            y6jVar.f269809O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269809O);
                            break;
                        case 17:
                            y6jVar.f269829e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, y6jVar.f269829e);
                            break;
                        case 18:
                            y6jVar.f269831f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, y6jVar.f269831f);
                            break;
                        case 19:
                            y6jVar.f269833g = typedArrayObtainStyledAttributes.getFloat(index, y6jVar.f269833g);
                            break;
                        case 20:
                            y6jVar.f269860x = typedArrayObtainStyledAttributes.getFloat(index, y6jVar.f269860x);
                            break;
                        case 21:
                            y6jVar.f269827d = typedArrayObtainStyledAttributes.getLayoutDimension(index, y6jVar.f269827d);
                            break;
                        case 22:
                            int i2 = typedArrayObtainStyledAttributes.getInt(index, a7jVar.f13061b);
                            a7jVar.f13061b = i2;
                            a7jVar.f13061b = f34929h[i2];
                            break;
                        case 23:
                            y6jVar.f269825c = typedArrayObtainStyledAttributes.getLayoutDimension(index, y6jVar.f269825c);
                            break;
                        case 24:
                            y6jVar.f269801G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269801G);
                            break;
                        case 25:
                            y6jVar.f269837i = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269837i);
                            break;
                        case 26:
                            y6jVar.f269839j = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269839j);
                            break;
                        case 27:
                            y6jVar.f269800F = typedArrayObtainStyledAttributes.getInt(index, y6jVar.f269800F);
                            break;
                        case 28:
                            y6jVar.f269802H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269802H);
                            break;
                        case 29:
                            y6jVar.f269841k = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269841k);
                            break;
                        case 30:
                            y6jVar.f269843l = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269843l);
                            break;
                        case 31:
                            y6jVar.f269806L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269806L);
                            break;
                        case 32:
                            y6jVar.f269856t = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269856t);
                            break;
                        case 33:
                            y6jVar.f269857u = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269857u);
                            break;
                        case 34:
                            y6jVar.f269803I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269803I);
                            break;
                        case 35:
                            y6jVar.f269847n = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269847n);
                            break;
                        case 36:
                            y6jVar.f269845m = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269845m);
                            break;
                        case 37:
                            y6jVar.f269861y = typedArrayObtainStyledAttributes.getFloat(index, y6jVar.f269861y);
                            break;
                        case 38:
                            x6jVar.f258682a = typedArrayObtainStyledAttributes.getResourceId(index, x6jVar.f258682a);
                            break;
                        case 39:
                            y6jVar.f269816V = typedArrayObtainStyledAttributes.getFloat(index, y6jVar.f269816V);
                            break;
                        case 40:
                            y6jVar.f269815U = typedArrayObtainStyledAttributes.getFloat(index, y6jVar.f269815U);
                            break;
                        case 41:
                            y6jVar.f269817W = typedArrayObtainStyledAttributes.getInt(index, y6jVar.f269817W);
                            break;
                        case 42:
                            y6jVar.f269818X = typedArrayObtainStyledAttributes.getInt(index, y6jVar.f269818X);
                            break;
                        case 43:
                            a7jVar.f13063d = typedArrayObtainStyledAttributes.getFloat(index, a7jVar.f13063d);
                            break;
                        case 44:
                            b7jVar.f24297m = true;
                            b7jVar.f24298n = typedArrayObtainStyledAttributes.getDimension(index, b7jVar.f24298n);
                            break;
                        case 45:
                            b7jVar.f24287c = typedArrayObtainStyledAttributes.getFloat(index, b7jVar.f24287c);
                            break;
                        case 46:
                            b7jVar.f24288d = typedArrayObtainStyledAttributes.getFloat(index, b7jVar.f24288d);
                            break;
                        case 47:
                            b7jVar.f24289e = typedArrayObtainStyledAttributes.getFloat(index, b7jVar.f24289e);
                            break;
                        case 48:
                            b7jVar.f24290f = typedArrayObtainStyledAttributes.getFloat(index, b7jVar.f24290f);
                            break;
                        case 49:
                            b7jVar.f24291g = typedArrayObtainStyledAttributes.getDimension(index, b7jVar.f24291g);
                            break;
                        case 50:
                            b7jVar.f24292h = typedArrayObtainStyledAttributes.getDimension(index, b7jVar.f24292h);
                            break;
                        case 51:
                            b7jVar.f24294j = typedArrayObtainStyledAttributes.getDimension(index, b7jVar.f24294j);
                            break;
                        case 52:
                            b7jVar.f24295k = typedArrayObtainStyledAttributes.getDimension(index, b7jVar.f24295k);
                            break;
                        case 53:
                            b7jVar.f24296l = typedArrayObtainStyledAttributes.getDimension(index, b7jVar.f24296l);
                            break;
                        case 54:
                            y6jVar.f269819Y = typedArrayObtainStyledAttributes.getInt(index, y6jVar.f269819Y);
                            break;
                        case 55:
                            y6jVar.f269820Z = typedArrayObtainStyledAttributes.getInt(index, y6jVar.f269820Z);
                            break;
                        case 56:
                            y6jVar.f269822a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269822a0);
                            break;
                        case 57:
                            y6jVar.f269824b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269824b0);
                            break;
                        case 58:
                            y6jVar.f269826c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269826c0);
                            break;
                        case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                            y6jVar.f269828d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269828d0);
                            break;
                        case 60:
                            b7jVar.f24286b = typedArrayObtainStyledAttributes.getFloat(index, b7jVar.f24286b);
                            break;
                        case 61:
                            y6jVar.f269795A = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269795A);
                            break;
                        case 62:
                            y6jVar.f269796B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269796B);
                            break;
                        case 63:
                            y6jVar.f269797C = typedArrayObtainStyledAttributes.getFloat(index, y6jVar.f269797C);
                            break;
                        case 64:
                            z6jVar.f279927b = m31727p(typedArrayObtainStyledAttributes, index, z6jVar.f279927b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                z6jVar.f279929d = aqs.f18771d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                z6jVar.f279929d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            z6jVar.f279931f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            z6jVar.f279933h = typedArrayObtainStyledAttributes.getFloat(index, z6jVar.f279933h);
                            break;
                        case 68:
                            a7jVar.f13064e = typedArrayObtainStyledAttributes.getFloat(index, a7jVar.f13064e);
                            break;
                        case 69:
                            y6jVar.f269830e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            y6jVar.f269832f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            break;
                        case 72:
                            y6jVar.f269834g0 = typedArrayObtainStyledAttributes.getInt(index, y6jVar.f269834g0);
                            break;
                        case 73:
                            y6jVar.f269836h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269836h0);
                            break;
                        case 74:
                            y6jVar.f269842k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            y6jVar.f269850o0 = typedArrayObtainStyledAttributes.getBoolean(index, y6jVar.f269850o0);
                            break;
                        case 76:
                            z6jVar.f279930e = typedArrayObtainStyledAttributes.getInt(index, z6jVar.f279930e);
                            break;
                        case 77:
                            y6jVar.f269844l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            a7jVar.f13062c = typedArrayObtainStyledAttributes.getInt(index, a7jVar.f13062c);
                            break;
                        case 79:
                            z6jVar.f279932g = typedArrayObtainStyledAttributes.getFloat(index, z6jVar.f279932g);
                            break;
                        case 80:
                            y6jVar.f269846m0 = typedArrayObtainStyledAttributes.getBoolean(index, y6jVar.f269846m0);
                            break;
                        case 81:
                            y6jVar.f269848n0 = typedArrayObtainStyledAttributes.getBoolean(index, y6jVar.f269848n0);
                            break;
                        case 82:
                            z6jVar.f279928c = typedArrayObtainStyledAttributes.getInteger(index, z6jVar.f279928c);
                            break;
                        case 83:
                            b7jVar.f24293i = m31727p(typedArrayObtainStyledAttributes, index, b7jVar.f24293i);
                            break;
                        case 84:
                            z6jVar.f279935j = typedArrayObtainStyledAttributes.getInteger(index, z6jVar.f279935j);
                            break;
                        case 85:
                            z6jVar.f279934i = typedArrayObtainStyledAttributes.getFloat(index, z6jVar.f279934i);
                            break;
                        case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                            int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i3 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                z6jVar.f279938m = resourceId;
                                if (resourceId != -1) {
                                    z6jVar.f279937l = -2;
                                }
                            } else if (i3 != 3) {
                                z6jVar.f279937l = typedArrayObtainStyledAttributes.getInteger(index, z6jVar.f279938m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                z6jVar.f279936k = string;
                                if (string.indexOf("/") <= 0) {
                                    z6jVar.f279937l = -1;
                                } else {
                                    z6jVar.f279938m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    z6jVar.f279937l = -2;
                                }
                            }
                            break;
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                        case 89:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            y6jVar.f269854r = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269854r);
                            break;
                        case 92:
                            y6jVar.f269855s = m31727p(typedArrayObtainStyledAttributes, index, y6jVar.f269855s);
                            break;
                        case 93:
                            y6jVar.f269807M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269807M);
                            break;
                        case 94:
                            y6jVar.f269814T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y6jVar.f269814T);
                            break;
                        case 95:
                            m31728q(y6jVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m31728q(y6jVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                            y6jVar.f269852p0 = typedArrayObtainStyledAttributes.getInt(index, y6jVar.f269852p0);
                            break;
                    }
                    i++;
                } else if (y6jVar.f269842k0 != null) {
                    y6jVar.f269840j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return x6jVar;
    }

    /* JADX INFO: renamed from: p */
    public static int m31727p(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX INFO: renamed from: q */
    public static void m31728q(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        w6j w6jVar;
        y6j y6jVar;
        h6j h6jVar;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof h6j) {
                    h6jVar = (h6j) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) h6jVar).width = i4;
                        h6jVar.f88125W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) h6jVar).height = i4;
                        h6jVar.f88126X = z;
                        return;
                    }
                }
                if (obj instanceof y6j) {
                    y6jVar = (y6j) obj;
                    if (i2 == 0) {
                        y6jVar.f269825c = i4;
                        y6jVar.f269846m0 = z;
                        return;
                    } else {
                        y6jVar.f269827d = i4;
                        y6jVar.f269848n0 = z;
                        return;
                    }
                }
                if (obj instanceof w6j) {
                    w6jVar = (w6j) obj;
                    if (i2 == 0) {
                        w6jVar.m87289b(23, i4);
                        w6jVar.m87291d(80, z);
                        return;
                    } else {
                        w6jVar.m87289b(21, i4);
                        w6jVar.m87291d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof h6j) {
                h6jVar = (h6j) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) h6jVar).width = i4;
                    h6jVar.f88125W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) h6jVar).height = i4;
                    h6jVar.f88126X = z;
                    return;
                }
            }
            if (obj instanceof y6j) {
                y6jVar = (y6j) obj;
                if (i2 == 0) {
                    y6jVar.f269825c = i4;
                    y6jVar.f269846m0 = z;
                    return;
                } else {
                    y6jVar.f269827d = i4;
                    y6jVar.f269848n0 = z;
                    return;
                }
            }
            if (obj instanceof w6j) {
                w6jVar = (w6j) obj;
                if (i2 == 0) {
                    w6jVar.m87289b(23, i4);
                    w6jVar.m87291d(80, z);
                    return;
                } else {
                    w6jVar.m87289b(21, i4);
                    w6jVar.m87291d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof h6j) {
                    h6j h6jVar2 = (h6j) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) h6jVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) h6jVar2).height = 0;
                    }
                    m31729r(h6jVar2, strTrim2);
                    return;
                }
                if (obj instanceof y6j) {
                    ((y6j) obj).f269862z = strTrim2;
                    return;
                } else {
                    if (obj instanceof w6j) {
                        ((w6j) obj).m87290c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof h6j) {
                        h6j h6jVar3 = (h6j) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) h6jVar3).width = 0;
                            h6jVar3.f88110H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) h6jVar3).height = 0;
                            h6jVar3.f88111I = f;
                            return;
                        }
                    }
                    if (obj instanceof y6j) {
                        y6j y6jVar2 = (y6j) obj;
                        if (i2 == 0) {
                            y6jVar2.f269825c = 0;
                            y6jVar2.f269816V = f;
                            return;
                        } else {
                            y6jVar2.f269827d = 0;
                            y6jVar2.f269815U = f;
                            return;
                        }
                    }
                    if (obj instanceof w6j) {
                        w6j w6jVar2 = (w6j) obj;
                        if (i2 == 0) {
                            w6jVar2.m87289b(23, 0);
                            w6jVar2.m87288a(f, 39);
                            return;
                        } else {
                            w6jVar2.m87289b(21, 0);
                            w6jVar2.m87288a(f, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof h6j) {
                        h6j h6jVar4 = (h6j) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) h6jVar4).width = 0;
                            h6jVar4.f88120R = fMax;
                            h6jVar4.f88114L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) h6jVar4).height = 0;
                            h6jVar4.f88121S = fMax;
                            h6jVar4.f88115M = 2;
                            return;
                        }
                    }
                    if (obj instanceof y6j) {
                        y6j y6jVar3 = (y6j) obj;
                        if (i2 == 0) {
                            y6jVar3.f269825c = 0;
                            y6jVar3.f269830e0 = fMax;
                            y6jVar3.f269819Y = 2;
                            return;
                        } else {
                            y6jVar3.f269827d = 0;
                            y6jVar3.f269832f0 = fMax;
                            y6jVar3.f269820Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof w6j) {
                        w6j w6jVar3 = (w6j) obj;
                        if (i2 == 0) {
                            w6jVar3.m87289b(23, 0);
                            w6jVar3.m87289b(54, 2);
                        } else {
                            w6jVar3.m87289b(21, 0);
                            w6jVar3.m87289b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m31729r(h6j h6jVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        h6jVar.f88109G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: s */
    public static void m31730s(x6j x6jVar, TypedArray typedArray) {
        int i;
        int indexCount = typedArray.getIndexCount();
        w6j w6jVar = new w6j();
        x6jVar.f258689h = w6jVar;
        z6j z6jVar = x6jVar.f258685d;
        int i2 = 0;
        z6jVar.f279926a = false;
        y6j y6jVar = x6jVar.f258686e;
        y6jVar.f269823b = false;
        a7j a7jVar = x6jVar.f258684c;
        a7jVar.f13060a = false;
        b7j b7jVar = x6jVar.f258687f;
        b7jVar.f24285a = false;
        int i3 = 0;
        while (i3 < indexCount) {
            int index = typedArray.getIndex(i3);
            int i4 = f34931j.get(index);
            SparseIntArray sparseIntArray = f34930i;
            switch (i4) {
                case 2:
                    i = i2;
                    w6jVar.m87289b(2, typedArray.getDimensionPixelSize(index, y6jVar.f269804J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i = i2;
                    break;
                case 5:
                    i = i2;
                    w6jVar.m87290c(5, typedArray.getString(index));
                    break;
                case 6:
                    i = i2;
                    w6jVar.m87289b(6, typedArray.getDimensionPixelOffset(index, y6jVar.f269798D));
                    break;
                case 7:
                    i = i2;
                    w6jVar.m87289b(7, typedArray.getDimensionPixelOffset(index, y6jVar.f269799E));
                    break;
                case 8:
                    i = i2;
                    w6jVar.m87289b(8, typedArray.getDimensionPixelSize(index, y6jVar.f269805K));
                    break;
                case 11:
                    i = i2;
                    w6jVar.m87289b(11, typedArray.getDimensionPixelSize(index, y6jVar.f269811Q));
                    break;
                case 12:
                    i = i2;
                    w6jVar.m87289b(12, typedArray.getDimensionPixelSize(index, y6jVar.f269812R));
                    break;
                case 13:
                    i = i2;
                    w6jVar.m87289b(13, typedArray.getDimensionPixelSize(index, y6jVar.f269808N));
                    break;
                case 14:
                    i = i2;
                    w6jVar.m87289b(14, typedArray.getDimensionPixelSize(index, y6jVar.f269810P));
                    break;
                case 15:
                    i = i2;
                    w6jVar.m87289b(15, typedArray.getDimensionPixelSize(index, y6jVar.f269813S));
                    break;
                case 16:
                    i = i2;
                    w6jVar.m87289b(16, typedArray.getDimensionPixelSize(index, y6jVar.f269809O));
                    break;
                case 17:
                    i = i2;
                    w6jVar.m87289b(17, typedArray.getDimensionPixelOffset(index, y6jVar.f269829e));
                    break;
                case 18:
                    i = i2;
                    w6jVar.m87289b(18, typedArray.getDimensionPixelOffset(index, y6jVar.f269831f));
                    break;
                case 19:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, y6jVar.f269833g), 19);
                    break;
                case 20:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, y6jVar.f269860x), 20);
                    break;
                case 21:
                    i = i2;
                    w6jVar.m87289b(21, typedArray.getLayoutDimension(index, y6jVar.f269827d));
                    break;
                case 22:
                    i = i2;
                    w6jVar.m87289b(22, f34929h[typedArray.getInt(index, a7jVar.f13061b)]);
                    break;
                case 23:
                    i = i2;
                    w6jVar.m87289b(23, typedArray.getLayoutDimension(index, y6jVar.f269825c));
                    break;
                case 24:
                    i = i2;
                    w6jVar.m87289b(24, typedArray.getDimensionPixelSize(index, y6jVar.f269801G));
                    break;
                case 27:
                    i = i2;
                    w6jVar.m87289b(27, typedArray.getInt(index, y6jVar.f269800F));
                    break;
                case 28:
                    i = i2;
                    w6jVar.m87289b(28, typedArray.getDimensionPixelSize(index, y6jVar.f269802H));
                    break;
                case 31:
                    i = i2;
                    w6jVar.m87289b(31, typedArray.getDimensionPixelSize(index, y6jVar.f269806L));
                    break;
                case 34:
                    i = i2;
                    w6jVar.m87289b(34, typedArray.getDimensionPixelSize(index, y6jVar.f269803I));
                    break;
                case 37:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, y6jVar.f269861y), 37);
                    break;
                case 38:
                    i = i2;
                    int resourceId = typedArray.getResourceId(index, x6jVar.f258682a);
                    x6jVar.f258682a = resourceId;
                    w6jVar.m87289b(38, resourceId);
                    break;
                case 39:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, y6jVar.f269816V), 39);
                    break;
                case 40:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, y6jVar.f269815U), 40);
                    break;
                case 41:
                    i = i2;
                    w6jVar.m87289b(41, typedArray.getInt(index, y6jVar.f269817W));
                    break;
                case 42:
                    i = i2;
                    w6jVar.m87289b(42, typedArray.getInt(index, y6jVar.f269818X));
                    break;
                case 43:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, a7jVar.f13063d), 43);
                    break;
                case 44:
                    i = i2;
                    w6jVar.m87291d(44, true);
                    w6jVar.m87288a(typedArray.getDimension(index, b7jVar.f24298n), 44);
                    break;
                case 45:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, b7jVar.f24287c), 45);
                    break;
                case 46:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, b7jVar.f24288d), 46);
                    break;
                case 47:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, b7jVar.f24289e), 47);
                    break;
                case 48:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, b7jVar.f24290f), 48);
                    break;
                case 49:
                    i = i2;
                    w6jVar.m87288a(typedArray.getDimension(index, b7jVar.f24291g), 49);
                    break;
                case 50:
                    i = i2;
                    w6jVar.m87288a(typedArray.getDimension(index, b7jVar.f24292h), 50);
                    break;
                case 51:
                    i = i2;
                    w6jVar.m87288a(typedArray.getDimension(index, b7jVar.f24294j), 51);
                    break;
                case 52:
                    i = i2;
                    w6jVar.m87288a(typedArray.getDimension(index, b7jVar.f24295k), 52);
                    break;
                case 53:
                    i = i2;
                    w6jVar.m87288a(typedArray.getDimension(index, b7jVar.f24296l), 53);
                    break;
                case 54:
                    i = i2;
                    w6jVar.m87289b(54, typedArray.getInt(index, y6jVar.f269819Y));
                    break;
                case 55:
                    i = i2;
                    w6jVar.m87289b(55, typedArray.getInt(index, y6jVar.f269820Z));
                    break;
                case 56:
                    i = i2;
                    w6jVar.m87289b(56, typedArray.getDimensionPixelSize(index, y6jVar.f269822a0));
                    break;
                case 57:
                    i = i2;
                    w6jVar.m87289b(57, typedArray.getDimensionPixelSize(index, y6jVar.f269824b0));
                    break;
                case 58:
                    i = i2;
                    w6jVar.m87289b(58, typedArray.getDimensionPixelSize(index, y6jVar.f269826c0));
                    break;
                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                    i = i2;
                    w6jVar.m87289b(59, typedArray.getDimensionPixelSize(index, y6jVar.f269828d0));
                    break;
                case 60:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, b7jVar.f24286b), 60);
                    break;
                case 62:
                    i = i2;
                    w6jVar.m87289b(62, typedArray.getDimensionPixelSize(index, y6jVar.f269796B));
                    break;
                case 63:
                    i = i2;
                    w6jVar.m87288a(typedArray.getFloat(index, y6jVar.f269797C), 63);
                    break;
                case 64:
                    i = i2;
                    w6jVar.m87289b(64, m31727p(typedArray, index, z6jVar.f279927b));
                    break;
                case 65:
                    i = i2;
                    if (typedArray.peekValue(index).type != 3) {
                        w6jVar.m87290c(65, aqs.f18771d[typedArray.getInteger(index, i)]);
                    } else {
                        w6jVar.m87290c(65, typedArray.getString(index));
                    }
                    break;
                case 66:
                    i = 0;
                    w6jVar.m87289b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    w6jVar.m87288a(typedArray.getFloat(index, z6jVar.f279933h), 67);
                    i = 0;
                    break;
                case 68:
                    w6jVar.m87288a(typedArray.getFloat(index, a7jVar.f13064e), 68);
                    i = 0;
                    break;
                case 69:
                    w6jVar.m87288a(typedArray.getFloat(index, 1.0f), 69);
                    i = 0;
                    break;
                case 70:
                    w6jVar.m87288a(typedArray.getFloat(index, 1.0f), 70);
                    i = 0;
                    break;
                case 71:
                    i = i2;
                    break;
                case 72:
                    w6jVar.m87289b(72, typedArray.getInt(index, y6jVar.f269834g0));
                    i = 0;
                    break;
                case 73:
                    w6jVar.m87289b(73, typedArray.getDimensionPixelSize(index, y6jVar.f269836h0));
                    i = 0;
                    break;
                case 74:
                    w6jVar.m87290c(74, typedArray.getString(index));
                    i = 0;
                    break;
                case 75:
                    w6jVar.m87291d(75, typedArray.getBoolean(index, y6jVar.f269850o0));
                    i = 0;
                    break;
                case 76:
                    w6jVar.m87289b(76, typedArray.getInt(index, z6jVar.f279930e));
                    i = 0;
                    break;
                case 77:
                    w6jVar.m87290c(77, typedArray.getString(index));
                    i = 0;
                    break;
                case 78:
                    w6jVar.m87289b(78, typedArray.getInt(index, a7jVar.f13062c));
                    i = 0;
                    break;
                case 79:
                    w6jVar.m87288a(typedArray.getFloat(index, z6jVar.f279932g), 79);
                    i = 0;
                    break;
                case 80:
                    w6jVar.m87291d(80, typedArray.getBoolean(index, y6jVar.f269846m0));
                    i = 0;
                    break;
                case 81:
                    w6jVar.m87291d(81, typedArray.getBoolean(index, y6jVar.f269848n0));
                    i = 0;
                    break;
                case 82:
                    w6jVar.m87289b(82, typedArray.getInteger(index, z6jVar.f279928c));
                    i = 0;
                    break;
                case 83:
                    w6jVar.m87289b(83, m31727p(typedArray, index, b7jVar.f24293i));
                    i = 0;
                    break;
                case 84:
                    w6jVar.m87289b(84, typedArray.getInteger(index, z6jVar.f279935j));
                    i = 0;
                    break;
                case 85:
                    w6jVar.m87288a(typedArray.getFloat(index, z6jVar.f279934i), 85);
                    i = 0;
                    break;
                case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                    int i5 = typedArray.peekValue(index).type;
                    if (i5 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        z6jVar.f279938m = resourceId2;
                        w6jVar.m87289b(89, resourceId2);
                        if (z6jVar.f279938m != -1) {
                            z6jVar.f279937l = -2;
                            w6jVar.m87289b(88, -2);
                        }
                    } else if (i5 == 3) {
                        String string = typedArray.getString(index);
                        z6jVar.f279936k = string;
                        w6jVar.m87290c(90, string);
                        if (z6jVar.f279936k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            z6jVar.f279938m = resourceId3;
                            w6jVar.m87289b(89, resourceId3);
                            z6jVar.f279937l = -2;
                            w6jVar.m87289b(88, -2);
                        } else {
                            z6jVar.f279937l = -1;
                            w6jVar.m87289b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, z6jVar.f279938m);
                        z6jVar.f279937l = integer;
                        w6jVar.m87289b(88, integer);
                    }
                    i = 0;
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i = i2;
                    break;
                case 93:
                    w6jVar.m87289b(93, typedArray.getDimensionPixelSize(index, y6jVar.f269807M));
                    i = i2;
                    break;
                case 94:
                    w6jVar.m87289b(94, typedArray.getDimensionPixelSize(index, y6jVar.f269814T));
                    i = i2;
                    break;
                case 95:
                    m31728q(w6jVar, typedArray, index, i2);
                    i = i2;
                    break;
                case 96:
                    m31728q(w6jVar, typedArray, index, 1);
                    i = i2;
                    break;
                case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                    w6jVar.m87289b(97, typedArray.getInt(index, y6jVar.f269852p0));
                    i = i2;
                    break;
                case 98:
                    if (MotionLayout.f633V1) {
                        int resourceId4 = typedArray.getResourceId(index, x6jVar.f258682a);
                        x6jVar.f258682a = resourceId4;
                        if (resourceId4 == -1) {
                            x6jVar.f258683b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        x6jVar.f258683b = typedArray.getString(index);
                    } else {
                        x6jVar.f258682a = typedArray.getResourceId(index, x6jVar.f258682a);
                    }
                    i = i2;
                    break;
                case 99:
                    w6jVar.m87291d(99, typedArray.getBoolean(index, y6jVar.f269835h));
                    i = i2;
                    break;
            }
            i3++;
            i2 = i;
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m31731w(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m31732a(MotionLayout motionLayout) {
        x6j x6jVar;
        int childCount = motionLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = motionLayout.getChildAt(i);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f34938g;
            if (!map.containsKey(numValueOf)) {
                mif1.m61891z(childAt);
            } else {
                if (this.f34937f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (x6jVar = (x6j) map.get(Integer.valueOf(id))) != null) {
                    d6j.m35117f(childAt, x6jVar.f258688g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m31733b(ConstraintLayout constraintLayout) {
        m31734c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: c */
    public final void m31734c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f34938g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                mif1.m61891z(childAt);
            } else {
                if (this.f34937f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    x6j x6jVar = (x6j) map.get(Integer.valueOf(id));
                    if (x6jVar != null) {
                        a7j a7jVar = x6jVar.f258684c;
                        y6j y6jVar = x6jVar.f258686e;
                        b7j b7jVar = x6jVar.f258687f;
                        if (childAt instanceof Barrier) {
                            y6jVar.f269838i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(y6jVar.f269834g0);
                            barrier.setMargin(y6jVar.f269836h0);
                            barrier.setAllowsGoneWidget(y6jVar.f269850o0);
                            int[] iArr = y6jVar.f269840j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = y6jVar.f269842k0;
                                if (str != null) {
                                    int[] iArrM31725j = m31725j(barrier, str);
                                    y6jVar.f269840j0 = iArrM31725j;
                                    barrier.setReferencedIds(iArrM31725j);
                                }
                            }
                        }
                        h6j h6jVar = (h6j) childAt.getLayoutParams();
                        h6jVar.m46730a();
                        x6jVar.m90092b(h6jVar);
                        d6j.m35117f(childAt, x6jVar.f258688g);
                        childAt.setLayoutParams(h6jVar);
                        if (a7jVar.f13062c == 0) {
                            childAt.setVisibility(a7jVar.f13061b);
                        }
                        childAt.setAlpha(a7jVar.f13063d);
                        childAt.setRotation(b7jVar.f24286b);
                        childAt.setRotationX(b7jVar.f24287c);
                        childAt.setRotationY(b7jVar.f24288d);
                        childAt.setScaleX(b7jVar.f24289e);
                        childAt.setScaleY(b7jVar.f24290f);
                        if (b7jVar.f24293i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(b7jVar.f24293i);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(b7jVar.f24291g)) {
                                childAt.setPivotX(b7jVar.f24291g);
                            }
                            if (!Float.isNaN(b7jVar.f24292h)) {
                                childAt.setPivotY(b7jVar.f24292h);
                            }
                        }
                        childAt.setTranslationX(b7jVar.f24294j);
                        childAt.setTranslationY(b7jVar.f24295k);
                        childAt.setTranslationZ(b7jVar.f24296l);
                        if (b7jVar.f24297m) {
                            childAt.setElevation(b7jVar.f24298n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            x6j x6jVar2 = (x6j) map.get(num);
            if (x6jVar2 != null) {
                y6j y6jVar2 = x6jVar2.f258686e;
                if (y6jVar2.f269838i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = y6jVar2.f269840j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = y6jVar2.f269842k0;
                        if (str2 != null) {
                            int[] iArrM31725j2 = m31725j(barrier2, str2);
                            y6jVar2.f269840j0 = iArrM31725j2;
                            barrier2.setReferencedIds(iArrM31725j2);
                        }
                    }
                    barrier2.setType(y6jVar2.f269834g0);
                    barrier2.setMargin(y6jVar2.f269836h0);
                    h6j h6jVarMo355m = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m40868m();
                    x6jVar2.m90092b(h6jVarMo355m);
                    constraintLayout.addView(barrier2, h6jVarMo355m);
                }
                if (y6jVar2.f269821a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    h6j h6jVarMo355m2 = constraintLayout.generateDefaultLayoutParams();
                    x6jVar2.m90092b(h6jVarMo355m2);
                    constraintLayout.addView(guideline, h6jVarMo355m2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof f6j) {
                ((f6j) childAt2).mo363f(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m31735e(int i, int i2) {
        x6j x6jVar;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f34938g;
        if (!map.containsKey(numValueOf) || (x6jVar = (x6j) map.get(Integer.valueOf(i))) == null) {
            return;
        }
        y6j y6jVar = x6jVar.f258686e;
        switch (i2) {
            case 1:
                y6jVar.f269839j = -1;
                y6jVar.f269837i = -1;
                y6jVar.f269801G = -1;
                y6jVar.f269808N = Integer.MIN_VALUE;
                return;
            case 2:
                y6jVar.f269843l = -1;
                y6jVar.f269841k = -1;
                y6jVar.f269802H = -1;
                y6jVar.f269810P = Integer.MIN_VALUE;
                return;
            case 3:
                y6jVar.f269847n = -1;
                y6jVar.f269845m = -1;
                y6jVar.f269803I = 0;
                y6jVar.f269809O = Integer.MIN_VALUE;
                return;
            case 4:
                y6jVar.f269849o = -1;
                y6jVar.f269851p = -1;
                y6jVar.f269804J = 0;
                y6jVar.f269811Q = Integer.MIN_VALUE;
                return;
            case 5:
                y6jVar.f269853q = -1;
                y6jVar.f269854r = -1;
                y6jVar.f269855s = -1;
                y6jVar.f269807M = 0;
                y6jVar.f269814T = Integer.MIN_VALUE;
                return;
            case 6:
                y6jVar.f269856t = -1;
                y6jVar.f269857u = -1;
                y6jVar.f269806L = 0;
                y6jVar.f269813S = Integer.MIN_VALUE;
                return;
            case 7:
                y6jVar.f269858v = -1;
                y6jVar.f269859w = -1;
                y6jVar.f269805K = 0;
                y6jVar.f269812R = Integer.MIN_VALUE;
                return;
            case 8:
                y6jVar.f269797C = -1.0f;
                y6jVar.f269796B = -1;
                y6jVar.f269795A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m31736f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f34938g;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            h6j h6jVar = (h6j) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f34937f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new x6j());
            }
            x6j x6jVar = (x6j) map.get(Integer.valueOf(id));
            if (x6jVar != null) {
                a7j a7jVar = x6jVar.f258684c;
                y6j y6jVar = x6jVar.f258686e;
                b7j b7jVar = x6jVar.f258687f;
                x6jVar.f258688g = d6j.m35115a(childAt, this.f34936e);
                x6j.m90091a(x6jVar, id, h6jVar);
                a7jVar.f13061b = childAt.getVisibility();
                a7jVar.f13063d = childAt.getAlpha();
                b7jVar.f24286b = childAt.getRotation();
                b7jVar.f24287c = childAt.getRotationX();
                b7jVar.f24288d = childAt.getRotationY();
                b7jVar.f24289e = childAt.getScaleX();
                b7jVar.f24290f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    b7jVar.f24291g = pivotX;
                    b7jVar.f24292h = pivotY;
                }
                b7jVar.f24294j = childAt.getTranslationX();
                b7jVar.f24295k = childAt.getTranslationY();
                b7jVar.f24296l = childAt.getTranslationZ();
                if (b7jVar.f24297m) {
                    b7jVar.f24298n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    y6jVar.f269850o0 = barrier.getAllowsGoneWidget();
                    y6jVar.f269840j0 = barrier.getReferencedIds();
                    y6jVar.f269834g0 = barrier.getType();
                    y6jVar.f269836h0 = barrier.getMargin();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m31737g(int i, int i2, int i3, int i4) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f34938g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new x6j());
        }
        x6j x6jVar = (x6j) map.get(Integer.valueOf(i));
        if (x6jVar == null) {
            return;
        }
        y6j y6jVar = x6jVar.f258686e;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    y6jVar.f269837i = i3;
                    y6jVar.f269839j = -1;
                    return;
                } else if (i4 == 2) {
                    y6jVar.f269839j = i3;
                    y6jVar.f269837i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m31731w(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    y6jVar.f269841k = i3;
                    y6jVar.f269843l = -1;
                    return;
                } else if (i4 == 2) {
                    y6jVar.f269843l = i3;
                    y6jVar.f269841k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    y6jVar.f269845m = i3;
                    y6jVar.f269847n = -1;
                    y6jVar.f269853q = -1;
                    y6jVar.f269854r = -1;
                    y6jVar.f269855s = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                }
                y6jVar.f269847n = i3;
                y6jVar.f269845m = -1;
                y6jVar.f269853q = -1;
                y6jVar.f269854r = -1;
                y6jVar.f269855s = -1;
                return;
            case 4:
                if (i4 == 4) {
                    y6jVar.f269851p = i3;
                    y6jVar.f269849o = -1;
                    y6jVar.f269853q = -1;
                    y6jVar.f269854r = -1;
                    y6jVar.f269855s = -1;
                    return;
                }
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                }
                y6jVar.f269849o = i3;
                y6jVar.f269851p = -1;
                y6jVar.f269853q = -1;
                y6jVar.f269854r = -1;
                y6jVar.f269855s = -1;
                return;
            case 5:
                if (i4 == 5) {
                    y6jVar.f269853q = i3;
                    y6jVar.f269851p = -1;
                    y6jVar.f269849o = -1;
                    y6jVar.f269845m = -1;
                    y6jVar.f269847n = -1;
                    return;
                }
                if (i4 == 3) {
                    y6jVar.f269854r = i3;
                    y6jVar.f269851p = -1;
                    y6jVar.f269849o = -1;
                    y6jVar.f269845m = -1;
                    y6jVar.f269847n = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                }
                y6jVar.f269855s = i3;
                y6jVar.f269851p = -1;
                y6jVar.f269849o = -1;
                y6jVar.f269845m = -1;
                y6jVar.f269847n = -1;
                return;
            case 6:
                if (i4 == 6) {
                    y6jVar.f269857u = i3;
                    y6jVar.f269856t = -1;
                    return;
                } else if (i4 == 7) {
                    y6jVar.f269856t = i3;
                    y6jVar.f269857u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    y6jVar.f269859w = i3;
                    y6jVar.f269858v = -1;
                    return;
                } else if (i4 == 6) {
                    y6jVar.f269858v = i3;
                    y6jVar.f269859w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m31731w(i2) + " to " + m31731w(i4) + " unknown");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m31738h(int i, int i2, int i3, int i4, int i5) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f34938g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new x6j());
        }
        x6j x6jVar = (x6j) map.get(Integer.valueOf(i));
        if (x6jVar == null) {
            return;
        }
        y6j y6jVar = x6jVar.f258686e;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    y6jVar.f269837i = i3;
                    y6jVar.f269839j = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Left to " + m31731w(i4) + " undefined");
                    }
                    y6jVar.f269839j = i3;
                    y6jVar.f269837i = -1;
                }
                y6jVar.f269801G = i5;
                return;
            case 2:
                if (i4 == 1) {
                    y6jVar.f269841k = i3;
                    y6jVar.f269843l = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                    }
                    y6jVar.f269843l = i3;
                    y6jVar.f269841k = -1;
                }
                y6jVar.f269802H = i5;
                return;
            case 3:
                if (i4 == 3) {
                    y6jVar.f269845m = i3;
                    y6jVar.f269847n = -1;
                    y6jVar.f269853q = -1;
                    y6jVar.f269854r = -1;
                    y6jVar.f269855s = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                    }
                    y6jVar.f269847n = i3;
                    y6jVar.f269845m = -1;
                    y6jVar.f269853q = -1;
                    y6jVar.f269854r = -1;
                    y6jVar.f269855s = -1;
                }
                y6jVar.f269803I = i5;
                return;
            case 4:
                if (i4 == 4) {
                    y6jVar.f269851p = i3;
                    y6jVar.f269849o = -1;
                    y6jVar.f269853q = -1;
                    y6jVar.f269854r = -1;
                    y6jVar.f269855s = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                    }
                    y6jVar.f269849o = i3;
                    y6jVar.f269851p = -1;
                    y6jVar.f269853q = -1;
                    y6jVar.f269854r = -1;
                    y6jVar.f269855s = -1;
                }
                y6jVar.f269804J = i5;
                return;
            case 5:
                if (i4 == 5) {
                    y6jVar.f269853q = i3;
                    y6jVar.f269851p = -1;
                    y6jVar.f269849o = -1;
                    y6jVar.f269845m = -1;
                    y6jVar.f269847n = -1;
                    return;
                }
                if (i4 == 3) {
                    y6jVar.f269854r = i3;
                    y6jVar.f269851p = -1;
                    y6jVar.f269849o = -1;
                    y6jVar.f269845m = -1;
                    y6jVar.f269847n = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                }
                y6jVar.f269855s = i3;
                y6jVar.f269851p = -1;
                y6jVar.f269849o = -1;
                y6jVar.f269845m = -1;
                y6jVar.f269847n = -1;
                return;
            case 6:
                if (i4 == 6) {
                    y6jVar.f269857u = i3;
                    y6jVar.f269856t = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                    }
                    y6jVar.f269856t = i3;
                    y6jVar.f269857u = -1;
                }
                y6jVar.f269806L = i5;
                return;
            case 7:
                if (i4 == 7) {
                    y6jVar.f269859w = i3;
                    y6jVar.f269858v = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException("right to " + m31731w(i4) + " undefined");
                    }
                    y6jVar.f269858v = i3;
                    y6jVar.f269859w = -1;
                }
                y6jVar.f269805K = i5;
                return;
            default:
                throw new IllegalArgumentException(m31731w(i2) + " to " + m31731w(i4) + " unknown");
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m31739i(int i, int i2) {
        m31740l(i).f258686e.f269827d = i2;
    }

    /* JADX INFO: renamed from: l */
    public final x6j m31740l(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f34938g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new x6j());
        }
        return (x6j) map.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: m */
    public final x6j m31741m(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f34938g;
        if (map.containsKey(numValueOf)) {
            return (x6j) map.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m31742n(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    x6j x6jVarM31726k = m31726k(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        x6jVarM31726k.f258686e.f269821a = true;
                    }
                    this.f34938g.put(Integer.valueOf(x6jVarM31726k.f258682a), x6jVarM31726k);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o */
    public final void m31743o(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            x6j x6jVarM31726k = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (x6jVarM31726k == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                x6jVarM31726k.f258686e.m92956b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (x6jVarM31726k == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                x6jVarM31726k.f258685d.m95508b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                x6jVarM31726k = m31726k(context, Xml.asAttributeSet(xmlResourceParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (x6jVarM31726k == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                x6jVarM31726k.f258684c.m24942b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (x6jVarM31726k == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                x6jVarM31726k.f258687f.m28379b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                x6jVarM31726k = m31726k(context, Xml.asAttributeSet(xmlResourceParser), false);
                                y6j y6jVar = x6jVarM31726k.f258686e;
                                y6jVar.f269821a = true;
                                y6jVar.f269823b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                x6jVarM31726k = m31726k(context, Xml.asAttributeSet(xmlResourceParser), false);
                                x6jVarM31726k.f258686e.f269838i0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                x6jVarM31726k = m31726k(context, Xml.asAttributeSet(xmlResourceParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (x6jVarM31726k == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    d6j.m35116e(context, xmlResourceParser, x6jVarM31726k.f258688g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f34938g.put(Integer.valueOf(x6jVarM31726k.f258682a), x6jVarM31726k);
                    x6jVarM31726k = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m31744t(int i, int i2) {
        m31740l(i).f258686e.f269813S = i2;
    }

    /* JADX INFO: renamed from: u */
    public final void m31745u(int i, int i2, int i3) {
        x6j x6jVarM31740l = m31740l(i);
        switch (i2) {
            case 1:
                x6jVarM31740l.f258686e.f269801G = i3;
                return;
            case 2:
                x6jVarM31740l.f258686e.f269802H = i3;
                return;
            case 3:
                x6jVarM31740l.f258686e.f269803I = i3;
                return;
            case 4:
                x6jVarM31740l.f258686e.f269804J = i3;
                return;
            case 5:
                x6jVarM31740l.f258686e.f269807M = i3;
                return;
            case 6:
                x6jVarM31740l.f258686e.f269806L = i3;
                return;
            case 7:
                x6jVarM31740l.f258686e.f269805K = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m31746v(int i, int i2) {
        m31740l(i).f258684c.f13061b = i2;
    }
}
