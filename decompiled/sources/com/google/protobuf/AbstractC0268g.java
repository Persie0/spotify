package com.google.protobuf;

import java.io.IOException;
import p204p.AbstractC2081l8;
import p204p.aux;
import p204p.e3t0;
import p204p.fj5;
import p204p.lgy0;
import p204p.owe;

/* JADX INFO: renamed from: com.google.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0268g extends AbstractC2081l8 {
    private final AbstractC0269h defaultInstance;
    protected AbstractC0269h instance;

    public AbstractC0268g(AbstractC0269h abstractC0269h) {
        this.defaultInstance = abstractC0269h;
        if (abstractC0269h.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = abstractC0269h.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        AbstractC0269h abstractC0269hNewMutableInstance = this.defaultInstance.newMutableInstance();
        AbstractC0269h abstractC0269h = this.instance;
        e3t0 e3t0Var = e3t0.f55882c;
        e3t0Var.getClass();
        e3t0Var.m37694a(abstractC0269hNewMutableInstance.getClass()).mo2153d(abstractC0269hNewMutableInstance, abstractC0269h);
        this.instance = abstractC0269hNewMutableInstance;
    }

    @Override // p204p.sre0
    public final boolean isInitialized() {
        return AbstractC0269h.m2121k(this.instance, false);
    }

    @Override // p204p.ore0
    public final AbstractC0269h build() {
        AbstractC0269h abstractC0269hBuildPartial = buildPartial();
        if (abstractC0269hBuildPartial.isInitialized()) {
            return abstractC0269hBuildPartial;
        }
        throw AbstractC2081l8.newUninitializedMessageException(abstractC0269hBuildPartial);
    }

    @Override // p204p.ore0
    public AbstractC0269h buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    @Override // 
    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final AbstractC0268g mo98325clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    @Override // p204p.sre0
    public AbstractC0269h getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // p204p.AbstractC2081l8
    public AbstractC0268g internalMergeFrom(AbstractC0269h abstractC0269h) {
        return mergeFrom(abstractC0269h);
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC0268g mo98328clone() {
        AbstractC0268g abstractC0268gNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        abstractC0268gNewBuilderForType.instance = buildPartial();
        return abstractC0268gNewBuilderForType;
    }

    public AbstractC0268g mergeFrom(AbstractC0269h abstractC0269h) {
        if (getDefaultInstanceForType().equals(abstractC0269h)) {
            return this;
        }
        copyOnWrite();
        AbstractC0269h abstractC0269h2 = this.instance;
        e3t0 e3t0Var = e3t0.f55882c;
        e3t0Var.getClass();
        e3t0Var.m37694a(abstractC0269h2.getClass()).mo2153d(abstractC0269h2, abstractC0269h);
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0268g mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) throws InvalidProtocolBufferException {
        copyOnWrite();
        try {
            e3t0 e3t0Var = e3t0.f55882c;
            AbstractC0269h abstractC0269h = this.instance;
            e3t0Var.getClass();
            e3t0Var.m37694a(abstractC0269h.getClass()).mo2158i(this.instance, bArr, i, i + i2, new fj5(auxVar));
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m1956h();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC0268g mo98329mergeFrom(byte[] bArr, int i, int i2) {
        return mo98330mergeFrom(bArr, i, i2, aux.m27220a());
    }

    @Override // p204p.ore0
    public AbstractC0268g mergeFrom(owe oweVar, aux auxVar) throws IOException {
        copyOnWrite();
        try {
            e3t0 e3t0Var = e3t0.f55882c;
            AbstractC0269h abstractC0269h = this.instance;
            e3t0Var.getClass();
            lgy0 lgy0VarM37694a = e3t0Var.m37694a(abstractC0269h.getClass());
            AbstractC0269h abstractC0269h2 = this.instance;
            C0266e c0266e = oweVar.f170702c;
            if (c0266e == null) {
                c0266e = new C0266e(oweVar);
            }
            lgy0VarM37694a.mo2159j(abstractC0269h2, c0266e, auxVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }
}
