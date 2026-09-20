package com.google.protobuf;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p204p.AbstractC2118m8;
import p204p.C2043k8;
import p204p.ae50;
import p204p.aux;
import p204p.b5a1;
import p204p.dbu0;
import p204p.dq60;
import p204p.e3t0;
import p204p.e8a;
import p204p.exb;
import p204p.fj5;
import p204p.gd8;
import p204p.gva;
import p204p.i3t0;
import p204p.ld50;
import p204p.lgy0;
import p204p.md50;
import p204p.n350;
import p204p.owe;
import p204p.pre0;
import p204p.r2n0;
import p204p.rd50;
import p204p.s571;
import p204p.shz;
import p204p.td50;
import p204p.ud50;
import p204p.uwe;
import p204p.vyd1;
import p204p.w110;
import p204p.xd50;
import p204p.y110;
import p204p.y1b0;
import p204p.y1s;
import p204p.z110;

/* JADX INFO: renamed from: com.google.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0269h extends AbstractC2118m8 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC0269h> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C0275n unknownFields;

    public AbstractC0269h() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C0275n.f2481f;
    }

    public static ld50 emptyBooleanList() {
        return e8a.f57117e;
    }

    public static md50 emptyDoubleList() {
        return y1s.f268380e;
    }

    public static td50 emptyFloatList() {
        return shz.f209298e;
    }

    public static ud50 emptyIntList() {
        return n350.f149935e;
    }

    public static xd50 emptyLongList() {
        return y1b0.f268222e;
    }

    public static <E> ae50 emptyProtobufList() {
        return i3t0.f98270e;
    }

    /* JADX INFO: renamed from: f */
    public static void m2120f(AbstractC0269h abstractC0269h) throws InvalidProtocolBufferException {
        if (abstractC0269h == null || abstractC0269h.isInitialized()) {
            return;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = abstractC0269h.newUninitializedMessageException();
        uninitializedMessageExceptionNewUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }

    public static <T extends AbstractC0269h> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC0269h) b5a1.m28155b(cls)).getDefaultInstanceForType();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put((Class<?>) cls, t2);
        return t2;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(dq60.m36615o("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m2121k(AbstractC0269h abstractC0269h, boolean z) {
        byte bByteValue = ((Byte) abstractC0269h.dynamicMethod(z110.f278202a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        e3t0 e3t0Var = e3t0.f55882c;
        e3t0Var.getClass();
        boolean zMo2151b = e3t0Var.m37694a(abstractC0269h.getClass()).mo2151b(abstractC0269h);
        if (z) {
            abstractC0269h.dynamicMethod(z110.f278203b, zMo2151b ? abstractC0269h : null, null);
        }
        return zMo2151b;
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC0269h m2122l(AbstractC0269h abstractC0269h, InputStream inputStream, aux auxVar) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            owe oweVarM68167g = owe.m68167g(new C2043k8(inputStream, owe.m68168s(inputStream, i), 1));
            AbstractC0269h partialFrom = parsePartialFrom(abstractC0269h, oweVarM68167g, auxVar);
            oweVarM68167g.mo2020a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            if (e.f2427a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC0269h m2123m(AbstractC0269h abstractC0269h, byte[] bArr, int i, aux auxVar) throws InvalidProtocolBufferException {
        if (i == 0) {
            return abstractC0269h;
        }
        AbstractC0269h abstractC0269hNewMutableInstance = abstractC0269h.newMutableInstance();
        try {
            e3t0 e3t0Var = e3t0.f55882c;
            e3t0Var.getClass();
            lgy0 lgy0VarM37694a = e3t0Var.m37694a(abstractC0269hNewMutableInstance.getClass());
            lgy0VarM37694a.mo2158i(abstractC0269hNewMutableInstance, bArr, 0, i, new fj5(auxVar));
            lgy0VarM37694a.mo2150a(abstractC0269hNewMutableInstance);
            return abstractC0269hNewMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            if (e.f2427a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m1956h();
        }
    }

    public static ud50 mutableCopy(ud50 ud50Var) {
        n350 n350Var = (n350) ud50Var;
        return n350Var.mo25687h(n350Var.f149937c * 2);
    }

    public static Object newMessageInfo(pre0 pre0Var, String str, Object[] objArr) {
        return new dbu0(pre0Var, str, objArr);
    }

    public static <ContainingType extends pre0, Type> y110 newRepeatedGeneratedExtension(ContainingType containingtype, pre0 pre0Var, rd50 rd50Var, int i, vyd1 vyd1Var, boolean z, Class cls) {
        return new y110(containingtype, i3t0.f98270e, pre0Var, new w110(rd50Var, i, vyd1Var, true, z));
    }

    public static <ContainingType extends pre0, Type> y110 newSingularGeneratedExtension(ContainingType containingtype, Type type, pre0 pre0Var, rd50 rd50Var, int i, vyd1 vyd1Var, Class cls) {
        return new y110(containingtype, type, pre0Var, new w110(rd50Var, i, vyd1Var, false, false));
    }

    public static <T extends AbstractC0269h> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) m2122l(t, inputStream, aux.m27220a());
        m2120f(t2);
        return t2;
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, ByteBuffer byteBuffer, aux auxVar) throws InvalidProtocolBufferException {
        owe oweVarM68166f;
        if (byteBuffer.hasArray()) {
            oweVarM68166f = owe.m68166f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && C0265d.m2053E()) {
            oweVarM68166f = new C0265d(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            oweVarM68166f = owe.m68166f(bArr, 0, iRemaining, true);
        }
        T t2 = (T) parseFrom(t, oweVarM68166f, auxVar);
        m2120f(t2);
        return t2;
    }

    public static <T extends AbstractC0269h> T parsePartialFrom(T t, owe oweVar, aux auxVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            e3t0 e3t0Var = e3t0.f55882c;
            e3t0Var.getClass();
            lgy0 lgy0VarM37694a = e3t0Var.m37694a(t2.getClass());
            C0266e c0266e = oweVar.f170702c;
            if (c0266e == null) {
                c0266e = new C0266e(oweVar);
            }
            lgy0VarM37694a.mo2159j(t2, c0266e, auxVar);
            lgy0VarM37694a.mo2150a(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            if (e.f2427a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends AbstractC0269h> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(z110.f278204c, null, null);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public int computeHashCode() {
        e3t0 e3t0Var = e3t0.f55882c;
        e3t0Var.getClass();
        return e3t0Var.m37694a(getClass()).mo2155f(this);
    }

    public final <MessageType2 extends AbstractC0269h, BuilderType2 extends AbstractC0268g> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(z110.f278206e, null, null);
    }

    public abstract Object dynamicMethod(z110 z110Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e3t0 e3t0Var = e3t0.f55882c;
        e3t0Var.getClass();
        return e3t0Var.m37694a(getClass()).mo2157h(this, (AbstractC0269h) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final r2n0 getParserForType() {
        return (r2n0) dynamicMethod(z110.f278208g, null, null);
    }

    @Override // p204p.AbstractC2118m8
    public int getSerializedSize(lgy0 lgy0Var) {
        int iMo2156g;
        int iMo2156g2;
        if (isMutable()) {
            if (lgy0Var == null) {
                e3t0 e3t0Var = e3t0.f55882c;
                e3t0Var.getClass();
                iMo2156g2 = e3t0Var.m37694a(getClass()).mo2156g(this);
            } else {
                iMo2156g2 = lgy0Var.mo2156g(this);
            }
            if (iMo2156g2 >= 0) {
                return iMo2156g2;
            }
            throw new IllegalStateException(s571.m77246e(iMo2156g2, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (lgy0Var == null) {
            e3t0 e3t0Var2 = e3t0.f55882c;
            e3t0Var2.getClass();
            iMo2156g = e3t0Var2.m37694a(getClass()).mo2156g(this);
        } else {
            iMo2156g = lgy0Var.mo2156g(this);
        }
        setMemoizedSerializedSize(iMo2156g);
        return iMo2156g;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // p204p.sre0
    public final boolean isInitialized() {
        return m2121k(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        e3t0 e3t0Var = e3t0.f55882c;
        e3t0Var.getClass();
        e3t0Var.m37694a(getClass()).mo2150a(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public void mergeLengthDelimitedField(int i, gva gvaVar) {
        if (this.unknownFields == C0275n.f2481f) {
            this.unknownFields = new C0275n();
        }
        C0275n c0275n = this.unknownFields;
        c0275n.m2192a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        c0275n.m2196f(exb.m40221s(i, 2), gvaVar);
    }

    public final void mergeUnknownFields(C0275n c0275n) {
        this.unknownFields = C0275n.m2191e(this.unknownFields, c0275n);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == C0275n.f2481f) {
            this.unknownFields = new C0275n();
        }
        C0275n c0275n = this.unknownFields;
        c0275n.m2192a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        c0275n.m2196f(exb.m40221s(i, 0), Long.valueOf(i2));
    }

    public AbstractC0269h newMutableInstance() {
        return (AbstractC0269h) dynamicMethod(z110.f278205d, null, null);
    }

    public boolean parseUnknownField(int i, owe oweVar) {
        if (exb.m40218p(i) == 4) {
            return false;
        }
        if (this.unknownFields == C0275n.f2481f) {
            this.unknownFields = new C0275n();
        }
        return this.unknownFields.m2195d(i, oweVar);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(s571.m77246e(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Alert.DURATION_SHOW_INDEFINITELY) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0270i.f2455a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0270i.m2126c(this, sb, 0);
        return sb.toString();
    }

    @Override // p204p.pre0
    public void writeTo(uwe uweVar) {
        e3t0 e3t0Var = e3t0.f55882c;
        e3t0Var.getClass();
        e3t0Var.m37694a(getClass()).mo2154e(this, gd8.m44371v(uweVar));
    }

    public final <MessageType2 extends AbstractC0269h, BuilderType2 extends AbstractC0268g> BuilderType2 createBuilder(MessageType2 messagetype2) {
        return (BuilderType2) createBuilder().mergeFrom((AbstractC0269h) messagetype2);
    }

    @Override // p204p.sre0
    public final AbstractC0269h getDefaultInstanceForType() {
        return (AbstractC0269h) dynamicMethod(z110.f278207f, null, null);
    }

    @Override // p204p.pre0
    public final AbstractC0268g newBuilderForType() {
        return (AbstractC0268g) dynamicMethod(z110.f278206e, null, null);
    }

    @Override // p204p.pre0
    public final AbstractC0268g toBuilder() {
        return ((AbstractC0268g) dynamicMethod(z110.f278206e, null, null)).mergeFrom(this);
    }

    public static xd50 mutableCopy(xd50 xd50Var) {
        y1b0 y1b0Var = (y1b0) xd50Var;
        return y1b0Var.mo25687h(y1b0Var.f268224c * 2);
    }

    public static <T extends AbstractC0269h> T parseDelimitedFrom(T t, InputStream inputStream, aux auxVar) throws InvalidProtocolBufferException {
        T t2 = (T) m2122l(t, inputStream, auxVar);
        m2120f(t2);
        return t2;
    }

    public static td50 mutableCopy(td50 td50Var) {
        shz shzVar = (shz) td50Var;
        return shzVar.mo25687h(shzVar.f209300c * 2);
    }

    public static md50 mutableCopy(md50 md50Var) {
        y1s y1sVar = (y1s) md50Var;
        return y1sVar.mo25687h(y1sVar.f268382c * 2);
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, aux.m27220a());
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, gva gvaVar) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, gvaVar, aux.m27220a());
        m2120f(t2);
        return t2;
    }

    public static ld50 mutableCopy(ld50 ld50Var) {
        e8a e8aVar = (e8a) ld50Var;
        return e8aVar.mo25687h(e8aVar.f57119c * 2);
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, gva gvaVar, aux auxVar) throws InvalidProtocolBufferException {
        owe oweVarMo34018o = gvaVar.mo34018o();
        T t2 = (T) parsePartialFrom(t, oweVarMo34018o, auxVar);
        oweVarMo34018o.mo2020a(0);
        m2120f(t2);
        return t2;
    }

    public static <E> ae50 mutableCopy(ae50 ae50Var) {
        return ae50Var.mo25687h(ae50Var.size() * 2);
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) m2123m(t, bArr, bArr.length, aux.m27220a());
        m2120f(t2);
        return t2;
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, byte[] bArr, aux auxVar) throws InvalidProtocolBufferException {
        T t2 = (T) m2123m(t, bArr, bArr.length, auxVar);
        m2120f(t2);
        return t2;
    }

    @Override // p204p.pre0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends AbstractC0269h> T parsePartialFrom(T t, owe oweVar) {
        return (T) parsePartialFrom(t, oweVar, aux.m27220a());
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, owe.m68167g(inputStream), aux.m27220a());
        m2120f(t2);
        return t2;
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, InputStream inputStream, aux auxVar) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, owe.m68167g(inputStream), auxVar);
        m2120f(t2);
        return t2;
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, owe oweVar) {
        return (T) parseFrom(t, oweVar, aux.m27220a());
    }

    public static <T extends AbstractC0269h> T parseFrom(T t, owe oweVar, aux auxVar) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, oweVar, auxVar);
        m2120f(t2);
        return t2;
    }
}
